package by.java_online.modul4.simple_class_and_object.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> studentList;

    public Group(String name) {
        this.name = name;
        studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (name != null ? !name.equals(group.name) : group.name != null) return false;
        return studentList != null ? studentList.equals(group.studentList) : group.studentList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (studentList != null ? studentList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
