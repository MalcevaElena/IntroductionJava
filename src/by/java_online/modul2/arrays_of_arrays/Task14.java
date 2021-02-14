package by.java_online.modul2.arrays_of_arrays;

/* Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 * причем в каждом столбце число единиц равно номеру столбца.
 */

public class Task14 {
    public static void main(String[] args) {
        int m = 7;
        int n = 5;
        int [][] matrix = new int [m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
                if (i < matrix[i].length && i<=j) {
                    for (int h = i; h >= 0; h--) {
                        matrix[h][j] = 1;
                    }
                }
            }
        }
        System.out.println("Матрица "+m+ " x "+n+":");
        printMatrix(matrix);
    }

    public static void printMatrix (int [][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d\t", arrays[i][j]);
            }
            System.out.println();
        }
    }
}
