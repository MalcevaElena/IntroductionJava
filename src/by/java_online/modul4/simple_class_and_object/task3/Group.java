package by.java_online.modul4.simple_class_and_object.task3;

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
}
