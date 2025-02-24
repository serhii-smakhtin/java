package StreamAPIHW;

import java.util.List;

public class Student {
    String name;
    int age;
    List<Grade> grades;
    String school;
    Address address;

    Student(String name, int age, List<Grade> grades, String school, Address address) {
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.school = school;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public String getSchool() {
        return school;
    }

    public Address getAddress() {
        return address;
    }
}
