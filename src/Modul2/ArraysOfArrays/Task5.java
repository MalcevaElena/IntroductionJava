package Modul2.ArraysOfArrays;
/* . Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
{ 1 1 1 1 }
{ 2 2 2 0 }
{ 3 3 0 0 }
{ 4 0 0 0 }
 */
public class Task5 {
    public static void main(String[] args) {
        int n = 8;
        int [][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix [i][j] = i+1;
                if (i>0) {
                    for (int h = i; h>0; h--) {
                        matrix[i][matrix[i].length-h] = 0;
                    }
                }
            }
        }
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
