package by.java_online.modul2.array_of_array;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * {1 1 1 1 1 1}
 * {0 1 1 1 1 0}
 * {0 0 1 1 0 0}
 * {0 0 1 1 0 0}
 * {0 1 1 1 1 0}
 * {1 1 1 1 1 1}
 */
public class Task06 {
    public static void main(String[] args) {
        int n = 6;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
                if (i > 0 && i < matrix.length / 2) {
                    for (int h = i; h > 0; h--) {
                        matrix[i][matrix[i].length - h] = 0;
                        matrix[i][h - 1] = 0;
                    }
                }
                if (i >= matrix.length / 2) {
                    for (int h = 0; h < matrix.length - i - 1; h++) {
                        matrix[i][matrix[i].length - 1 - h] = 0;
                        matrix[i][h] = 0;
                    }
                }
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
