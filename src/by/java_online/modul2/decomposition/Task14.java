package by.java_online.modul2.decomposition;
/* Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведенная в степень n, равна самому числу.
 * Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int k;

        k = enterToConsole("K");

        System.out.println("Числа Армстронга: ");
        numberArmstrong(k);

    }

    public static void numberArmstrong(int number) {
        int x;
        int[] elementNumber;
        int numberArmstrong;


        for (int i = 1; i <= number; i++) { // роверяем числа от 1 до К
            x = i;
            numberArmstrong = 0;
            elementNumber = new int[sizeArray(x)];

            for (int j = 0; j < elementNumber.length; j++) { // разбиваем число на элементы и записываем в массив
                elementNumber[j] = x % 10;

                //сумма элементов в степени длины числа
                numberArmstrong += searchNumber(elementNumber[j], elementNumber.length);

                x /= 10;
            }

            if (numberArmstrong == i) {
                System.out.print(+i + ", ");
            }
        }
    }

    public static int searchNumber(int x, int length) {
        return (int) Math.pow(x, length);

    }

    public static int sizeArray(int number) {
        int size = 0;
        while (number > 0) {
            number /= 10;
            size++;
        }
        return size;
    }

    public static int enterToConsole(String message) {
        int number;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите положительное число " + message + ": ");

            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число. Повторите попытку.");
                sc.next();
            }
            number = sc.nextInt();
        }
        while (number <= 0);

        return number;
    }
}