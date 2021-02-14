package by.java_online.modul2.arrays_of_arrays;

/* В числовой матрице поменять местами два столбца любых столбца,
 * т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 *  а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    static int n = 5;

    public static void main(String[] args) {
    int [][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix [i][j] = (int) (Math.random()*5);
            }
        }
    System.out.println("Дана матрица:");
    printMatrix(matrix);
    System.out.println("Выведите номера 2х столбцов, которые необходимо поменять местами. От 1 до "+n);
    int one = read()-1;
    int two = read()-1;
    System.out.println("Отсортированная матрица:");
    sortMatrix(matrix, one, two);

}
    public static void printMatrix (int [][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d\t", arrays[i][j]);
            }
            System.out.println();
        }
    }
    public static int read() {
        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number<1 || number > n) {
            System.out.println("Вы ввели число меньше 1 или больше "+n+". " +
                    "Это не соответствует условию. Повторите ввод.");
            return read();
        }
        return number;
        }
        catch (NumberFormatException ex) {
            System.out.println("Ошибка. Вы ввели не число! Повторите ввод");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return read();
    }
    public static void sortMatrix (int [][] arrays, int x, int y){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                 if ( j == x ) {
                     int temp = arrays [i][j];
                     arrays [i][j] = arrays [i][y];
                     arrays [i][y] = temp;
                 }
            }
        }
        printMatrix(arrays);
    }
}
