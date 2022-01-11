package JavaVideo.List.ПотокиВводаВывода;

import JavaVideo.List.treemap.AverageStudentGrade;
import JavaVideo.List.treemap.SubjectGrade;
import JavaVideo.List.treemap.TreeMapRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;

public class IOMain {
    private static final String FILE_N_AME = "GradeBook.txt";
    private static final String BINARY_FILE = "Students.bin";

    public static void main(String[] args) throws IOException {
        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        Reader reader = new Reader();
        Writer writer = new Writer();
        //writer.writeFile(grades, FILE_N_AME);
        //reader.readFile(FILE_N_AME);
        //processGrades(grades, writer, BINARY_FILE);
        //outputObjects(reader, BINARY_FILE);
        System.out.println(System.getProperty("user.dir"));
        FileUtils fileUtils = new FileUtils();
      //  fileUtils.printIOFileDetails(FILE_N_AME);
      //  fileUtils.printIOFileDetails("./");
        fileUtils.printNioFileDetails(FILE_N_AME);

//        writer.writeWithFormatter();

           /*     try (FileInputStream reader = new FileInputStream(FILE_N_AME);
             FileOutputStream writer = new FileOutputStream("GradeBookBite.txt")) {
            int c;
            while ((c =reader.read()) != -1){
                System.out.print(c);
                writer.write(c);
            }
        }*/
    }

    private static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileNAme) {
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey : grades.keySet()) {
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(), grades.get(gradeKey)));
            writer.writeObject(students, fileNAme);
        }
    }

    private static void outputObjects(Reader reader, String fileName){
        List<Student> students = reader.readObject(fileName);
        for (Student student : students) {
            System.out.printf("%s, %.2f, %n", student.getName(), student.getAverageGrade());
            System.out.println(student.getGrades());
        }

    }
}
