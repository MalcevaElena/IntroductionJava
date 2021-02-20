package by.java_online.modul2.array_of_array;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
            }
        }

        System.out.println("Дана матрица:");
        printMatrix(matrix);

        System.out.println("Отсортировать строки матрицы по возрастанию:");
        sortIncrease(matrix);

        System.out.println("Отсортировать строки матрицы по убыванию:");
        sortDecrease(matrix);
    }

    public static void printMatrix(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d\t", arrays[i][j]);
            }
            System.out.println();
        }
    }

    public static void sortIncrease(int[][] arrays) {
        int tmp;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                for (int k = 0; k < arrays[i].length - 1; k++) {
                    if (arrays[i][k] > arrays[i][k + 1]) {
                        tmp = arrays[i][k + 1];
                        arrays[i][k + 1] = arrays[i][k];
                        arrays[i][k] = tmp;
                    }
                }
            }
        }
        printMatrix(arrays);
    }

    public static void sortDecrease(int[][] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                for (int k = 0; k < array[i].length - 1; k++) {
                    if (array[i][k] < array[i][k + 1]) {
                        tmp = array[i][k + 1];
                        array[i][k + 1] = array[i][k];
                        array[i][k] = tmp;
                    }
                }
            }
        }
        printMatrix(array);
    }
}
