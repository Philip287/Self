package JavaVideo.List.ПотокиВводаВывода;

import JavaVideo.List.treemap.AverageStudentGrade;
import JavaVideo.List.treemap.SubjectGrade;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

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

    public void writeObject(List<Student> students, String fileName){
        try(ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            for (Student student : students){
                out.writeObject(student);
            }
            out.writeObject(new Student("", -1.00f,null));
        }catch (IOException e){
            System.out.println("File can't be opened. Program terminate.");
            e.printStackTrace(System.out);
        }
    }
}
