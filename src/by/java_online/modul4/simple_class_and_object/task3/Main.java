package by.java_online.modul4.simple_class_and_object.task3;
/* Создайте класс с именем Student, содержащий поля:
 * фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 * Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("Ф06");
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Иванов" + i, "Aркадий", 20 + i);
            for (int j = 0; j < students[i].getAcademicPerformance().length; j++) {
                students[i].getAcademicPerformance()[j] = (int) (Math.random() * 3 + 8);
            }
        }

        for (Student student : students) {
            group.add(student);
        }

        StudentLogic studentLogic = new StudentLogic();
        GroupLogic groupLogic = new GroupLogic(studentLogic);

        View.printGroup(group);

        List<Student> aStudens = groupLogic.AcademicPerformanceStudents(group);
        View.printAStudens(aStudens, group);

    }
}