package JavaVideo.List.ПотокиВводаВывода;

import JavaVideo.List.treemap.AverageStudentGrade;
import JavaVideo.List.treemap.SubjectGrade;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Writer {
    public void writeWithFormatter() throws FileNotFoundException {
        Formatter formatter = new Formatter("BankAccounts.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter client ID, client Name, Surname, account balance.");

        int i = 0;
        while (i < 3) {
            try {
                formatter.format("%d, %s, %s, %.2f %n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat());
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Input is incorrect. Please try again.");
                scanner.nextLine();
            }
        }
        formatter.close();
    }

    public void writeFile(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, String fileName) throws IOException {
        File file;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("========================================\n");
                writer.write("Student: " + gradeKey.getName() + ", average grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {
                    writer.write("Subject: " + grade.getSubject() + ", grade: " + grade.getGrade() + "\n");
                }
            }
        }
    }

    public void writeObject(List<Student> students, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            for (Student student : students) {
                out.writeObject(student);
            }
            out.writeObject(new Student("", -1.00f, null));
        } catch (IOException e) {
            System.out.println("File can't be opened. Program terminate.");
            e.printStackTrace(System.out);
        }
    }

    public void nioWriteWithBuffer(String fileName) throws IOException {
        Path paths = Paths.get(fileName);
        Charset charset = Charset.forName("UTF-8");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(paths, charset)) {
            bufferedWriter.write(fileName, 0, fileName.length());
        }
    }

    public void nioWriteWithStream(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        String str = "File can't be opened. Program terminate.";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        try (OutputStream writer = Files.newOutputStream(path, CREATE, APPEND)) {
            writer.write(bytes);
        }
    }

    public void nioWriteWithChannel(String fileName) throws IOException {
        String str = "Constructs an IOException with the specified cause and a detail message of (cause==null ? null :" +
                " cause.toString()) (which typically contains the class and detail message of cause). This constructor " +
                "is useful for IO exceptions that are little more than wrappers for other throwables. Params:" +
                "cause – The cause (which is saved for later retrieval by the getCause() method). (A null value is permitted, " +
                "and indicates that the cause is nonexistent or unknown.) Since: 1.6";
        RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.wrap(str.getBytes());
        fileChannel.write(byteBuffer);
        fileChannel.close();


    }

    public void writeWithRandomAccess(String fileName) throws IOException {
        ByteBuffer mark = ByteBuffer.wrap("Marked area".toUpperCase(Locale.ROOT).getBytes());
        ByteBuffer buffer = ByteBuffer.allocate(10);
        Path path = Paths.get(fileName);

        try (FileChannel openedFile = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.READ)) {
            int numBytes = 0;
            while (buffer.hasRemaining() && numBytes != -1){
                numBytes = openedFile.read(buffer);
            }
            openedFile.position(0);
            openedFile.write(mark);

            long size = openedFile.size();
            openedFile.position(size/2);
            mark.rewind();
            openedFile.write(mark);
            openedFile.position(size -1);
            mark.rewind();
            openedFile.write(mark);
            buffer.rewind();
            openedFile.write(buffer);
        }
    }
}
