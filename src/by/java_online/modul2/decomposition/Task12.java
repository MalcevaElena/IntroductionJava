package by.java_online.modul2.decomposition;

/* Даны натуральные числа К и N.
 * Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task12 {
    public static int n;
    public static int k;
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] array;

        k = enterToConsole("K");
        n = enterToConsole("N");

        listFormation();

        array = new int[list.size()];

        System.out.println("Массив А, элементами которого являются числа," +
                " сумма цифр которых равна К и которые не большее N.");
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
            System.out.print(array[i] + ", ");
        }
    }

    public static void listFormation() {
        int element;
        int sumElement = 0;

        for (int i = 0; i < k; i++) {
            element = element();
            sumElement += element;

            if (sumElement == k) {
                list.add(element);
                break;
            } else if (sumElement > k) {
                sumElement -= element;
            } else {
                list.add(element);
            }
        }
    }

    public static int element() {
        int rand = (int) (Math.random() * n - 1);
        if (rand > 0) {
            return rand;
        } else {
            return 1;
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
