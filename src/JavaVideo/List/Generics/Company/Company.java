package JavaVideo.List.Generics.Company;

import JavaVideo.List.Generics.Company.employees.Employee;
import JavaVideo.List.Generics.Company.employees.ITSpecialist;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public void print(List<?> list){
        System.out.println("Size " + list.size());
        System.out.println(list);
    }

    public <T extends Employee> void addDepartment(Department<T> dep){
        departments.add(dep);
        List<T> employeeList = dep.getEmployees();
        giveRise(employeeList);
        this.employees.addAll(employeeList);
    }

    public void giveRise(List<? extends Employee> employees) {
        for (Employee employee : employees){
            float rise = employee.getSalary() * 0.2f;
            employee.setSalary(employee.getSalary() + rise);
        }
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addToIdEmployees(List<? super ITSpecialist> list){
        list.add(new ITSpecialist("Joe", 3500.0f));
    }

    @Override
    public String toString() {
        return "Company departments= " + departments +
                ", employees= " + employees +
                ".";
    }
}
