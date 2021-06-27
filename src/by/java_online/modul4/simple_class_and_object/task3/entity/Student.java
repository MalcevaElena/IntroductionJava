package by.java_online.modul4.simple_class_and_object.task3.entity;

import java.util.Arrays;

public class Student {
    private String lastName;
    private String name;
    private int age;
    private final int[] academicPerformance; //кол-во экзаменов 5 и оценки;

    public Student(String lastName, String name, int age) {
        this.lastName = lastName;
        this.name = name;
        this.age = age;
        academicPerformance = new int[5];
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (lastName != null ? !lastName.equals(student.lastName) : student.lastName != null) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return Arrays.equals(academicPerformance, student.academicPerformance);
    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + Arrays.hashCode(academicPerformance);
        return result;
    }
}
