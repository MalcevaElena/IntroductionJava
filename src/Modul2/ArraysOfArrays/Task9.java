package Modul2.ArraysOfArrays;
/*
 Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class Task9 {
    public static void main(String[] args) {
        int n = 5;
        double [][] matrix = new double [n][n];
        double [] matrixSum = new double[n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            matrix [i][j] = Math.random()*5;
            matrixSum [j] += matrix [i][j];
        }
    }
    System.out.println("Дана матрица:");
    printMatrix(matrix);
    System.out.println("Сумма элементов в каждом столбце:");
    printArray(matrixSum);
    int indexMax = maxElement(matrixSum)+1;
    System.out.println("максимальную сумму содержит столбец №"+indexMax);



}
    public static void printMatrix (double [][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%6.2f", arrays[i][j]);
            }
            System.out.println();
        }
    }
    public static void printArray (double [] arrays) {
        for (double j: arrays) {
            System.out.printf("%6.2f", j); }
        System.out.println();
    }
    public static int maxElement (double [] array) {
       double maxElement = 0;
       int indexMaxElement = 0;
       for (int i =0; i < array.length; i++){
            if (maxElement < array[i]) {
                maxElement=array[i];
                indexMaxElement = i;
            }
        }
       return indexMaxElement;
    }
}
