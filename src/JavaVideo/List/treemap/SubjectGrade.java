package JavaVideo.List.treemap;

import java.util.Objects;

public class SubjectGrade {
    private final String subject;
    private final int grade;

    public SubjectGrade(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectGrade gradel = (SubjectGrade) o;
        if(grade != gradel.grade) return false;
        return Objects.equals(subject, gradel.subject);
    }

    @Override
    public int hashCode() {
        int result = subject != null ? subject.hashCode():null;
        result = 31 * result + grade;
        return result;
    }

    @Override
    public String toString() {
        return "Subject: " + subject+  ", " + "grade: " + grade ;
    }
}
