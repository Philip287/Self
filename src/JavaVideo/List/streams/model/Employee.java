package JavaVideo.List.streams.model;

public class Employee {
    private int id;
    private String firstName;
    private String lastNAme;
    private Integer salary;

    public Employee(int id, String firstName, String lastNAme, Integer salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Employee: id= " + id +
                ", firstName= " + firstName + ", lastNAme= " + lastNAme +
                ", salary=" + salary;
    }
}
