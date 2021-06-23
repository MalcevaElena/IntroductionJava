package by.java_online.modul4.simple_class_and_object.task3;

import java.util.Arrays;

/* Создайте класс с именем Student, содержащий поля:
 * фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 * Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Student {
    private String lastNameAndInitials;
    private int numberGroup;
    private final int[] academicPerformance; //кол-во экзаменов;

    public Student() {
        academicPerformance = new int[5];
    }

    public Student(String lastNameAndInitials, int numberGroup) {
        this.lastNameAndInitials = lastNameAndInitials;
        this.numberGroup = numberGroup;
        academicPerformance = new int[5];
    }

    public String getLastNameAndInitials() {
        return lastNameAndInitials;
    }

    public void setLastNameAndInitials(String lastNameAndInitials) {
        lastNameAndInitials = lastNameAndInitials;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }


    public static boolean excellentStudents(Student student) {
        int count = 0;
        for (int i = 0; i < student.academicPerformance.length; i++) {
            if (student.academicPerformance[i] < 9) {
                count++;
            }
        }
        return count == 0 ? true: false;
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Иванов" + i, 20 + i);
            for (int j = 0; j < students[i].academicPerformance.length; j++) {
                students[i].academicPerformance[j] = (int) (Math.random() * 3 + 8);
            }

        }
        System.out.println("Все студенты:");
        for (Student st : students) {
            System.out.println("ФИО студента:" + st.lastNameAndInitials + ", номер группы: " + st.numberGroup + Arrays.toString(st.academicPerformance));
        }
        System.out.println("Отличники");
        for (Student st : students) {
            if (Student.excellentStudents(st)) {
                System.out.println("ФИО студента:" + st.lastNameAndInitials + ", номер группы: " + st.numberGroup);
            }
        }
    }
}
