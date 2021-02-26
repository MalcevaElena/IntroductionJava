package by.java_online.modul2.decomposition;

import java.util.Scanner;

/* Из заданного числа вычли сумму его цифр.
 * Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 */
public class Task17 {

    public static void main(String[] args) {
        int n;
        int sumElement;
        int count = 0;

        n = enterToConsole("n");
        System.out.println("Дано число " + n);

        while (n > 0) {
            sumElement = sumNumber(n);
            System.out.println("Из числа " + n + " вычли " + sumElement + " (сумму его чисел) ");
            n -= sumNumber(n);
            ;
            count++;
        }

        System.out.println("Итого, " + count + " раз(а), чтобы получился ноль.");
    }

    public static int sumNumber(int number) {
        int sum = 0;
        int length;
        int[] elementNumber;

        int x = number;
        length = String.valueOf(number).length();
        elementNumber = new int[length];

        for (int i = 0; i < length; i++) {
            elementNumber[i] = x % 10;
            sum += elementNumber[i];
            x /= 10;
        }
        return sum;
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

