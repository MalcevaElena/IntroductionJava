package by.java_online.modul2.decomposition;

/* Два простых числа называются «близнецами», если они
 * отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n],
 *  где n - заданное натуральное число больше 2.
 *  Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int numberN;
        int number2N;

        numberN = enterToConsole("N");
        number2N = 2 * numberN;

        for (int i = numberN; i < number2N - 1; i++) {
            System.out.printf("Число %d, его бизнец %d\n", i, i + 2);
        }
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