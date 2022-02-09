package JavaVideo.List.LambdaExpressions;

public class Employee {
    private String firstName;
    private String lastNAme;
    private Integer salary;

    Employee(String firstName, String lastNAme, int salary){
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee firstName = " + firstName + ", lastNAme= " + lastNAme + ", salary = " + salary;
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
