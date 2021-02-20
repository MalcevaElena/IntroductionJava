package by.java_online.modul2.array_of_array;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {
    public static void main(String[] args) {
        int n = 6;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10) - 5;
            }
        }

        System.out.println("Дана квадратная матрица:");
        printMatrix(matrix);

        System.out.println("Положительные элементы главной диагонали матрицы:");
        printPositiveElement(matrix);
    }

    public static void printMatrix(int[][] arrays) {
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.printf("%3d\t", i);
            }
            System.out.println();
        }
    }

    public static void printPositiveElement(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j && array[i][j] > 0) {
                    System.out.printf("%3d\t", array[i][j]);
                }
            }
        }
    }
}

