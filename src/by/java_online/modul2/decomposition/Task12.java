package by.java_online.modul2.decomposition;

/* Даны натуральные числа К и N.
 * Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

import java.util.Scanner;

public class Task12 {
    public static int n;
    public static int k;
    public static int[] array = new int[1];

    public static void main(String[] args) {
        k = enterToConsole("K");
        n = enterToConsole("N");

        arrayFormation();

        System.out.println("Массив А, элементами которого являются числа," +
                " сумма цифр которых равна " + k + " и которые не большее " + n + ".");

        for (int j : array) {
            System.out.print(j + ", ");
        }
    }

    public static void arrayFormation() {
        int element;
        int sumElement = 0;
        int countSizeArray = 0;

        for (int i = 1; i < n; i++) {
            if (i < 10) {
                sumElement = i;
            } else {
                element = i;
                while (element != 0) {
                    sumElement += element % 10;
                    element /= 10;
                }
            }

            if (sumElement == k) {
                if (countSizeArray > 0) { // если длина массива больше 1
                    int[] arrayA = new int[countSizeArray + 1]; //создаем нвый массив на 1 больше
                    for (int j = 0; j < arrayA.length - 1; j++) { // копируем значения из одного массива в другой
                        arrayA[j] = array[j];
                    }
                    array = arrayA; // передаем ссылку на новый массив
                }
                array[countSizeArray] = i;
                countSizeArray++;
            }
            sumElement = 0;
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
