package by.java_online.modul2.arrays_sorting;

/* Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2<= an и b1 <= b2 <= bm. Требуется указать те места,
 * на которые нужно вставлять элементы последовательности b1 <= b2 <= bm в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task7 {
    public static void main(String[] args) {
        int[] arrayA = {2, 5, 7, 9, 23, 54, 87};
        int[] arrayB = {1, 4, 12, 67, 99};
        System.out.println("Даны две последовательности.");
        System.out.println("Последовательность А: ");
        printArray(arrayA);
        System.out.println("Последовательность B: ");
        printArray(arrayB);
        System.out.println("Требуется указать те места, " +
                " на которые нужно вставлять элементы последовательности B в A.");
        System.out.println("C уже вставленных элементов:");
        index(arrayA, arrayB);
    }

    public static void index(int[] one, int[] two) {
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < one.length; j++) {
                if (two[i] < one[j]) {
                    System.out.printf("%d елемент массива B вставим в %d элемент массива А.\n", i, j+i);
                    break;
                } else if (two[i] > one[one.length - 1]) {
                    System.out.printf("%d елемент массива B вставим в %d элемент массива А.\n", i, one.length +i);
                    break;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%2d\t", i);
        }
        System.out.println();
    }
}
