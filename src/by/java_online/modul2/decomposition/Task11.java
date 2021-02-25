package by.java_online.modul2.decomposition;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int one;
        int two;
        int oneLength;
        int twoLength;
        int max;

        one = enterToConsole("1");
        two = enterToConsole("2");

        oneLength = numberLength(one);
        twoLength = numberLength(two);
        // twoLength = String.valueOf(n).length();

        max = maxNumberLength(oneLength, twoLength);

        if (oneLength == twoLength) {
            System.out.println("В числе " + one + " и " + two + " одинаковое количество цифр");
        } else if (max == oneLength) {
            System.out.println("В числе " + one + " больше цифр, чем в числе " + two);
        } else {
            System.out.println("В числе " + two + " больше цифр, чем в числе " + one);
        }
    }

    public static int numberLength(int x) {
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    public static int maxNumberLength(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static int enterToConsole(String message) {
        int number;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите положительное число № " + message + ": ");

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
