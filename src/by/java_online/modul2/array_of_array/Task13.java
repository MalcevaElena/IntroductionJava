package by.java_online.modul2.array_of_array;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
            }
        }

        System.out.println("Дана матрица:");
        printMatrix(matrix);

        System.out.println("Отсортировать столбцы матрицы по возрастанию:");
        sortIncrease(matrix);

        System.out.println("Отсортировать столбцы матрицы по убыванию:");
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
            for (int k = 0; k < arrays[i].length - 1; k++) {
                for (int j = 0; j < arrays[i].length; j++) {
                    if (arrays[k][j] > arrays[k + 1][j]) {
                        tmp = arrays[k + 1][j];
                        arrays[k + 1][j] = arrays[k][j];
                        arrays[k][j] = tmp;
                    }
                }
            }
        }
        printMatrix(arrays);
    }

    public static void sortDecrease(int[][] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length - 1; k++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[k][j] < array[k + 1][j]) {
                        tmp = array[k + 1][j];
                        array[k + 1][j] = array[k][j];
                        array[k][j] = tmp;
                    }
                }
            }
        }
        printMatrix(array);
    }
}

