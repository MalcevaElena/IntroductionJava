package by.java_online.modul4.simple_class_and_object.task2;
/* Создайте класс Test2 двумя переменными.
 * Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию.
 * Добавьте set- и get- методы для полей экземпляра класса.
 */

import java.util.Objects;

public class Test2 {
    private String name;
    private int age;

    public Test2() {
        this.name = null;
        this.age = 0;
    }

    public Test2(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test2 test2 = (Test2) o;

        if (age != test2.age) return false;
        return Objects.equals(name, test2.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Test2 {  name='" + name + '\'' +
                ", age=" + age + '}';
    }
}
