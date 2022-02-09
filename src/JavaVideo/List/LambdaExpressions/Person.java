package JavaVideo.List.LambdaExpressions;

public class Person {
    private String firstName;
    private String lastNAme;
    private Integer age;

    Person(String firstName, String lastNAme, int salary){
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.age = salary;
    }

    @Override
    public String toString() {
        return "Employee firstName = " + firstName + ", lastNAme= " + lastNAme + ", salary = " + age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
