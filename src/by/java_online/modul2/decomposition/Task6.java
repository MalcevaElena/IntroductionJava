package by.java_online.modul2.decomposition;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int one;
        int two;
        int three;
        boolean result;

        System.out.println("Введите 3 положительных числа.");
        one = enterToConsole("1:");
        two = enterToConsole("2:");
        three = enterToConsole("3: ");

        result = checkNumber(one, two, three);

        if (result == true) {
            System.out.println("Данные три числа являются взаимно простыми");
        }
        else {
            System.out.println("Данные три числа не являются взаимно простыми");
        }
    }


    public static int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }

    public static boolean checkNumber(int x, int y, int z) {
        int nod;

        nod = nod(x, y);
        nod = nod(nod, z);

        if (nod == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int enterToConsole(String message) {
        @SuppressWarnings("resource")
        Scanner sc;
        int number;

        sc = new Scanner(System.in);

        do {
            System.out.println("Введите число № " + message);

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

