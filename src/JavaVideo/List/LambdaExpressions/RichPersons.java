package JavaVideo.List.LambdaExpressions;

public class RichPersons {
    private String firstName;
    private String lastNAme;
    private double salary;
    private Integer age;

    public RichPersons(String firstName, String lastNAme, Integer salary, Integer age) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "RichPersons: firstName= " + firstName +", lastNAme='" + lastNAme + ", salary=" + salary + ", age="
                + age;
    }
}
