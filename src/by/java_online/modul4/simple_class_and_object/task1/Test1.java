package by.java_online.modul4.simple_class_and_object.task1;

import java.io.Serial;
import java.io.Serializable;

/* Создайте класс Test1 двумя переменными.
 * Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */
public class Test1 implements Serializable {

    @Serial
    private static final long serialVersionUID = 4686918439082965784L;

    private int numberOne = 4;
    private int numberTwo = 8;

    public Test1 (){}

    public void print(int one, int two) {
        System.out.println(one + ", " + two);
    }

    public int change(int x) {
        return x * 2;
    }

    public int sum(int one, int two) {
        return one + two;
    }

    public static int max(int one, int two) {
        return one > two ? one : two;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test1 test1 = (Test1) o;

        if (numberOne != test1.numberOne) return false;
        return numberTwo == test1.numberTwo;
    }

    @Override
    public int hashCode() {
        int result = numberOne;
        result = 31 * result + numberTwo;
        return result;
    }

    @Override
    public String toString() {
        return "Test1 { numberOne = " + numberOne +
                ", numberTwo = " + numberTwo + '}';
    }
}
