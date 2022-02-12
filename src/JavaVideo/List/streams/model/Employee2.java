package JavaVideo.List.streams.model;

import java.util.Objects;

public class Employee2 {
    private int id;
    private String firstName;
    private String lastNAme;
    private Integer salary;
    private String department;

    public Employee2(int id, String firstName, String lastNAme, Integer salary, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.salary = salary;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee2 id= " + id +
                ", firstName= " + firstName +
                ", lastNAme= " + lastNAme +
                ", salary= " + salary +
                ", department= " + department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return id == employee2.id && Objects.equals(firstName, employee2.firstName) && Objects.equals(lastNAme, employee2.lastNAme) && Objects.equals(salary, employee2.salary) && Objects.equals(department, employee2.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastNAme, salary, department);
    }
}
