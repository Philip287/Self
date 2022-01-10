package JavaVideo.List.ПотокиВводаВывода;

import JavaVideo.List.treemap.AverageStudentGrade;
import JavaVideo.List.treemap.SubjectGrade;
import JavaVideo.List.treemap.TreeMapRunner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NavigableMap;
import java.util.Set;

import static JavaVideo.List.treemap.TreeMapRunner.createGrades;

public class IOMain {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
            File file;
            writer = new FileWriter("GradeBook.txt");
            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("========================================\n");
                writer.write("Student: " + gradeKey.getName() + ", average grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {
                    writer.write("Subject: " + grade.getSubject() + ", grade: " + grade.getGrade() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }finally {
           try {
               writer.close();
           }catch (IOException e){
               e.printStackTrace(System.out);
           }
        }
    }
}
