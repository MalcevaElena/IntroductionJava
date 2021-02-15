package by.java_online.modul2.arrays_sorting;

/* Даны две последовательности a1 <= a2<=an и b1 <= b2 <= bm.
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] arrayA = {1, 23, 35, 46, 58, 69};
        int [] arrayB = {3, 5, 8, 12, 53, 62, 88};

        System.out.println("Даны 2 последовательности.");
        System.out.println("Последовательность один: ");
        printArray(arrayA);
        System.out.println("Последовательность два:");
        printArray(arrayB);
        System.out.println("Образовать из них новую последовательность чисел так," +
                " чтобы она тоже была неубывающей:");
        unionOfArray(arrayA, arrayB);
}

    public static void unionOfArray (int [] one, int [] two) {
        int [] arrays = new int[one.length+two.length];
        for (int i = 0; i < arrays.length; i++) {
            if (i < one.length){
                arrays[i] = one[i];
            }
            else {
                arrays [i] = two[i-one.length];
            }
        }
        Arrays.sort(arrays);
        printArray(arrays);
    }
    public static void printArray (int [] array) {
        for (int i: array) {
            System.out.printf("%2d\t",i);
        }
        System.out.println();
    }
}
