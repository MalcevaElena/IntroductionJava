package by.java_online.modul2.arrays_of_arrays;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = new int[9][9];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 5);
            }
        }
        System.out.println("Дана квадратная матрица:");
        printMatrix(matrix);
        System.out.println("Вывести на экран элементы, стоящие на диагонали.");
        printDiagonal(matrix);
    }

    public static void printMatrix(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d\t", arrays[i][j]);
            }
            System.out.println();
        }
    }

    public static void printDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || j == array.length - 1 - i) {
                    System.out.printf("%3d\t", array[i][j]);
                } else System.out.print("    ");
            }
            System.out.println();
        }
    }
}
