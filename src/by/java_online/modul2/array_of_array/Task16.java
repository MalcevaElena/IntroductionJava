package by.java_online.modul2.array_of_array;
/* Магическим квадратом порядка n называется квадратная матрица размера nxn,
 * составленная из чисел 1, 2, 3, n2 так, что суммы по каждому столбцу,
 *  каждой строке и каждой из двух больших диагоналей равны между
 * собой. Построить такой квадрат.
 */

public class Task16 {
    public static void main(String[] args) {
        int n = 4;
        int count = 1;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        printMatrix(matrix);
        reverseArray(matrix);

        System.out.println("Магический квадрат 4x4:");
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

    public static void reverseArray(int[][] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array.length / 2; j++) {
                if (i == j) {
                    temp = array[i][j];
                    array[i][j] = array[array.length - 1 - i][array.length - 1 - j];
                    array[array.length - 1 - i][array.length - 1 - j] = temp;
                }
            }
        }
        for (int i = 0, j = array.length - 1 - i; i <= (array.length / 2) - 1; ++i, --j) {
            temp = array[i][j];
            array[i][j] = array[j][i];
            array[j][i] = temp;
        }
    }

}
