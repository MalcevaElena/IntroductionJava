package by.java_online.modul2.decomposition;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {
    public static void main(String[] args) {
        int sum = 0;

        for (int x = 1; x <= 9; x++) {
            if (x % 2 == 1) {
                sum += factorial(x);
            }
        }
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна " + sum);
    }

    public static int factorial(int i) {
        int factor = 1;

        for (; i > 0; i--) {
            factor *= i;
        }
        return factor;
    }
}
