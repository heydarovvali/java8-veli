package az.developia.springcore;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private int id;
    private String name;
    private int age;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Person() {
        id = 1234;
        name = "Vali";
        age = 27;
        salary = 3000;

    }
}
