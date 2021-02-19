package by.java_online.modul1.cycle;

/* Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int m;
        int n;

        m = enterToConsole("m:");
        n = enterToConsole("n:");

        if (m >= 0 && n >= 0 && m <= n) {
            for (int i = m; i <= n; i++) {
                System.out.print("Делители для числа " + i + ": ");
                for (int y = 2; y < n; y++) {
                    if (i % y == 0 && i != y) {
                        System.out.print(y + " ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Вы ввели m меньше n.");
        }
    }

    public static int enterToConsole(String message) {
        @SuppressWarnings("resource")
        Scanner sc;
        int number;

        sc = new Scanner(System.in);

        do {
            System.out.println("Введите положительное число " + message);

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
