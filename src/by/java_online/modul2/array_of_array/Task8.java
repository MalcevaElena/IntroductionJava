package by.java_online.modul2.array_of_array;

/* В числовой матрице поменять местами два столбца любых столбца,
 * т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 * а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры.
 */

import java.util.Scanner;

public class Task8 {
    private static final int n = 5;

    public static void main(String[] args) {
        int one;
        int two;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 5);
            }
        }

        System.out.println("Дана матрица:");
        printMatrix(matrix);

        System.out.println("Выведите номера 2х столбцов, которые необходимо поменять местами. ");

        one = read("первого") - 1;
        two = read("второго") - 1;

        System.out.println("Отсортированная матрица:");
        sortMatrix(matrix, one, two);

    }

    public static void printMatrix(int[][] arrays) {
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.printf("%3d\t", i);
            }
            System.out.println();
        }
    }

    public static int read(String message) {
        int number;

        @SuppressWarnings("resource")
        Scanner sc;
        sc = new Scanner(System.in);

        do {
            System.out.println("Выведите номер "+message+" столбца от 1 до " + n);

            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число. Повторите попытку.");
                sc.next();
            }

            number = sc.nextInt();

            if (number > n) {
                System.out.println("Вы ввели число больше " + n + ". " +
                        "Это не соответствует условию. Повторите ввод.");}
            else if (number<=0){
                System.out.println("Вы ввели число меньше 1. " +
                        "Это не соответствует условию. Повторите ввод.");
            }
        }
        while (number <= 0|| number>n);

        return number;
    }

    public static void sortMatrix(int[][] arrays, int x, int y) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (j == x) {
                    int temp = arrays[i][j];
                    arrays[i][j] = arrays[i][y];
                    arrays[i][y] = temp;
                }
            }
        }
        printMatrix(arrays);
    }
}
