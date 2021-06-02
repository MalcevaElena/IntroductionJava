package by.java_online.modul4.simple_class_and_object.task1;

/* Создайте класс Test1 двумя переменными.
 * Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */
public class Test1 {

    private int numberOne = 4;
    private int numberTwo = 8;

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
}
