package by.java_online.modul2.decomposition;


import java.util.Random;

/* Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива,
 *  но больше всех других элементов).
 */
public class Task5 {
    public static void main(String[] args) {
        int n = 7;
        int number;
        int[] array = new int[n];

        Random rand = new Random();
        for (int i = 0; i< array.length; i ++) {
            array [i] = rand.nextInt(20);
        }

        System.out.println("Дан массив:");
        printArray(array);

        number = searchNumber(array);
        System.out.println("Число, которое меньше максимального элемента массива," +
                " но больше всех других элементов: " + number);

    }

    public static int searchNumber(int[] arrays) {
        int max = 0;
        int minMax = 0;

        for (int i : arrays) {
            if (i > max) {
                max = i;
            }
            if (i > minMax && i < max) {
                minMax = i;
            }
        }
        return minMax;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("%2d\t", i);
        }
        System.out.println();
    }
}
