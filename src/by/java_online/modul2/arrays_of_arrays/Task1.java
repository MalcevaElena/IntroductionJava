package by.java_online.modul2.arrays_of_arrays;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][15];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 5);
            }
        }
        System.out.println("Дана матрица:");
        printMatrix(matrix);
        System.out.println("Вывести на экран все нечетные столбцы," +
                " у которых первый элемент больше последнего.");
        printOddColumn(matrix);
    }

    public static void printMatrix(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d\t", arrays[i][j]);
            }
            System.out.println();
        }
    }

    public static void printOddColumn(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j += 2) {
                if (array[0][j] > array[array.length - 1][j]) {
                    System.out.printf("%3d\t", array[i][j]);
                }
            }
            System.out.println();
        }
    }
}
