package by.java_online.modul2.array_of_array;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * { 1, 2, 3,   , n}
 * {n, n-1, n-2,   ,1}
 */

public class Task04 {
    public static void main(String[] args) {
        int n = 8;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j + 1;
            }
        }

        for (int i = 1; i < matrix.length; i += 2) {
            for (int j = matrix[i].length; j > 0; j--) {
                matrix[i][matrix[i].length - j] = j;
            }
        }

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d\t", arrays[i][j]);
            }
            System.out.println();
        }
    }
}
