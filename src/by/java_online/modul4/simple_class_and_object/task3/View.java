package by.java_online.modul4.simple_class_and_object.task3;

import java.util.Arrays;
import java.util.List;

public class View {

    public static void printGroup(Group group) {

        System.out.println("Все студенты группы " + group + ":");
        for (Student st : group.getStudentList()) {
            System.out.println("Фамилия и имя студента:" + st.getLastName() + " " + st.getName() + ", возраст: "
                    + st.getAge() + ", оценки за экзамены: " + Arrays.toString(st.getAcademicPerformance()));
        }
    }

    public static void printAStudens(List<Student> students, Group group) {

        System.out.println("Отличники:");
        for (Student st : students) {
            System.out.println("Фамилия студента:" + st.getLastName() + ", Номер группы: " + group.getName());
        }
    }
}
