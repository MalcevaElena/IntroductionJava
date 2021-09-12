package by.java_online.modul4.simple_class_and_object.task3.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -723503427662931684L;

    private String lastName;
    private String name;
    private int age;
    private final int[] academicPerformance = new int[5]; //кол-во экзаменов 5;

    public Student() {
    }

    public Student(String lastName, String name, int age) {
        this.lastName = lastName;
        this.name = name;
        this.age = age;
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

    public int getAcademicPerformance(int index) {
        return academicPerformance[index];
    }

    public void setAcademicPerformance(int index, int number) {
        this.academicPerformance[index] = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (!Objects.equals(lastName, student.lastName)) return false;
        if (!Objects.equals(name, student.name)) return false;
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

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", academicPerformance=" + Arrays.toString(academicPerformance) +
                '}';
    }
}
