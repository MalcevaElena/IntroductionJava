/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */
package Modul2.ArraysOfArrays;

public class Task10 {
    public static void main(String[] args) {
        int n = 6;
        int [][] matrix = new int [n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix [i][j] = (int)(Math.random()*10)-5;
            }
        }
        System.out.println("Дана квадратная матрица:");
        printMatrix(matrix);
        System.out.println("Положительные элементы главной диагонали матрицы:");
        printPositiveElement(matrix);
    }

    public static void printMatrix (int [][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d\t", arrays[i][j]);
            }
            System.out.println();
        }
    }
    public static void printPositiveElement (int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                 if (i==j && array[i][j]>0){
                     System.out.printf("%3d\t", array[i][j]);
                 }
            }

        }
    }
}

