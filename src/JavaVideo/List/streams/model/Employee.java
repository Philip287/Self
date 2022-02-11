package JavaVideo.List.streams.model;
import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastNAme;
    private Integer salary;
    // конструктор по умолчанию:
    public Employee() {
    }
    // Параметризированный конструктор:
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastNAme, employee.lastNAme) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastNAme, salary);
    }
}
