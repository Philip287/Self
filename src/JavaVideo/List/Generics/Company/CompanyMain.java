package JavaVideo.List.Generics.Company;

import JavaVideo.List.Generics.Company.employees.Accountant;
import JavaVideo.List.Generics.Company.employees.ITSpecialist;
import JavaVideo.List.Generics.Company.employees.Manager;

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company();

        Department<Accountant> accounting = new Department<>("Accounting", 5);
        Department<Manager> management = new Department<>("Management", 10);
        Department<ITSpecialist> itGuys = new Department<>("ItGuys", 2);

        Accountant accountant = new Accountant("Alex", 1000.0f);
        ITSpecialist it = new ITSpecialist("James", 2000.0f);
        Manager manager = new Manager("Michal", 4000.0f);

        accounting.addEmploee(accountant);
        itGuys.addEmploee(it);
        management.addEmploee(manager);

        company.addDepartment(accounting);
        company.addDepartment(itGuys);
        company.addDepartment(management);

        //System.out.println(company);
        company.print(company.getDepartments());
        company.print(company.getEmployees());

        company.addToIdEmployees(itGuys.getEmployees());
        company.addToIdEmployees(company.getEmployees());

    }
}
