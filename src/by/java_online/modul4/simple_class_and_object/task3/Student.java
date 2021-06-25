package by.java_online.modul4.simple_class_and_object.task3;

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

}
