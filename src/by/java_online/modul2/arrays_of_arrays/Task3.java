package by.java_online.modul2.arrays_of_arrays;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {
    private static int k = (int) (Math.random()*5);
    private static int p = (int) (Math.random()*5);

    public static void main(String[] args) {
        int [][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix [i][j] = (int) (Math.random()*5);
            }
        }
        System.out.println("Дана матрица:");
        printMatrix(matrix);
        System.out.println("Вывести "+k+"-ю строку и "+p+"-й столбец матрицы.");
        printResult(matrix);
    }
    public static void printMatrix (int [][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d\t", arrays[i][j]);
            }
            System.out.println();
        }
    }
    public static void printResult (int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i==k-1 || j==p-1) {
                    System.out.printf("%3d\t",array[i][j]);
                }
                else System.out.print("    ");
            }
            System.out.println();
        }
    }
}

