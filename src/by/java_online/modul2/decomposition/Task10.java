package by.java_online.modul2.decomposition;

/* Дано натуральное число N.
 * Написать метод(методы) для формирования массива,
 * элементами которого являются цифры числа N.
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n;
        int arrayLength;
        int[] array;

        n = enterToConsole();
        arrayLength = arrayLength(n);
        array = new int[arrayLength];
        arrayFormation(n, arrayLength, array);

        System.out.println("Массив, элементами которого являются цифры числа " + n + ": ");
        printArray(array);

    }

    public static void arrayFormation(int x, int y, int[] arrays) {
        while (x > 0) {
            arrays[y - 1] = x % 10;
            x /= 10;
            y--;
        }
    }

    public static int arrayLength(int x) {
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    public static int enterToConsole() {
        @SuppressWarnings("resource")
        Scanner sc;
        int number;

        sc = new Scanner(System.in);

        do {
            System.out.println("Введите положительное число: ");

            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число. Повторите попытку.");
                sc.next();
            }
            number = sc.nextInt();
        }
        while (number <= 0);

        return number;
    }

    public static void printArray(int[] arrays) {
        for (int j : arrays) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
}
