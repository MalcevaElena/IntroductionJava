package by.java_online.modul2.decomposition;

import java.util.Scanner;

/* Написать программу, определяющую сумму n - значных чисел,
 * содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме.
 * Для решения задачи использовать декомпозицию.
 */
public class Task16 {

    public static void main(String[] args) {
        int n;
        int min;
        int max;
        int x;
        int[] elementNumber;
        int sumEvenNumber = 0;
        int sumOddNumber = 0;

        n = enterToConsole("n, где n-значность числа от 1 до 9");
        min = minNumber(n);
        max = maxNumber(n);

        for (int i = min; i <= max; i++) {
            x = i;
            elementNumber = new int[n];
            if (max > 9) {
                for (int j = 0; j < n; j++) { // разбиваем число на элементы и записываем в массив
                    elementNumber[j] = x % 10;
                    x /= 10;
                    if (elementNumber[j] % 2 == 0) { // если элемент положительный - переходим к следующему числу
                        break;
                    }
                }
            } else if (i % 2 == 1) {
                elementNumber[0] = i;
            }
            sumOddNumber += sumNumber(elementNumber);
        }
        sumEvenNumber = evenNumber(sumOddNumber);

        System.out.println("Сумма " + n + " - значных чисел, содержащих только нечетные цифры = " + sumOddNumber);
        System.out.println("Четных цифр в найденной сумме: " + sumEvenNumber);
    }

    public static int evenNumber(int number) {
        int count = 0;
        int element;

        if (number > 9) {
            while (number > 0) {
                element = number % 10;
                number /= 10;
                if (element % 2 == 0) {
                    count++;
                }
            }
        } else {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int sumNumber(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
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
        while (number <= 0 || number > 9);

        return number;
    }
}

