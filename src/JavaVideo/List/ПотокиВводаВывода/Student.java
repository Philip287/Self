package JavaVideo.List.ПотокиВводаВывода;

import JavaVideo.List.treemap.SubjectGrade;

import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable {
    private String name;
    private Float averageGrade;
    private Set<SubjectGrade> grades;

    public Student(String name, Float averageGrade, Set<SubjectGrade> grades) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public Float getAverageGrade() {
        return averageGrade;
    }

    public Set<SubjectGrade> getGrades() {
        return grades;
    }
}
