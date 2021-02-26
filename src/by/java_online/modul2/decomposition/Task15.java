package by.java_online.modul2.decomposition;

import java.util.Scanner;

/* Найти все натуральные n-значные числа,
 * цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
 * Для решения задачи использовать декомпозицию.
 */
public class Task15 {
    public static void main(String[] args) {
        int n;
        int min;
        int max;
        int x;
        int[] elementNumber;

        n = enterToConsole("n, где n-значность числа от 2 до 9");
        min = minNumber(n);
        max = maxNumber(n);

        for (int i = min; i <= max; i++) {
            x = i;
            elementNumber = new int[n];

            for (int j = 0; j < n; j++) { // разбиваем число на элементы и записываем в массив
                elementNumber[j] = x % 10;
                x /= 10;
            }
            if (searchNumber(elementNumber)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean searchNumber(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] + 1) { //123, 234, 345...
                count++;
            } else break;
        }
        return count == array.length - 1;
    }

    public static int minNumber(int number) { // 11, 111, ...
        int min = 1;
        for (int i = 1; i < number; i++) {
            min = min * 10 + 1;
        }

        return min;

    }

    public static int maxNumber(int number) { // 99, 999, ...
        int max = 9;
        for (int i = 1; i < number; i++) {
            max = max * 10 + 9;
        }

        return max;

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
        while (number <= 1 || number > 9);

        return number;
    }
}
