package Glava11.HomeTask.Task7;

import java.util.Objects;

public class ClassTask7 {
    private String name;
    private Integer age;
    private int mass;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int getMass() {
        return mass;
    }

    public ClassTask7(String name, Integer age, int mass) {
        this.name = name;
        this.age = age;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "name = " + name +  " age = " + age +
                " mass = " + mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassTask7 that = (ClassTask7) o;
        return mass == that.mass && Objects.equals(name, that.name) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mass);
    }
}
