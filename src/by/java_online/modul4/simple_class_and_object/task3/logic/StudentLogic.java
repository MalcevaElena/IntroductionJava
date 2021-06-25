package by.java_online.modul4.simple_class_and_object.task3.logic;

import by.java_online.modul4.simple_class_and_object.task3.entity.Student;

public class StudentLogic {

    public boolean excellentStudents(Student student) {
        int[] marks;

        marks = student.getAcademicPerformance();

        for (int mark : marks) {
            if (mark < 9) {
                return false;
            }
        }
        return true;
    }

}
