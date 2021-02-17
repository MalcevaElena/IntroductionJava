package by.java_online.modul2.one_arrays;

/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */

public class Task9 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 7);
        }
        System.out.println("Дан массив целых чисел с количеством элементов - " + n);
        printArray(array);
        System.out.println("Наиболее частовстречаемое число: ");
        System.out.println(mostRepeatingNumber(array));
    }

    public static void printArray(int[] ar) {
        for (int j : ar) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }

    public static int mostRepeatingNumber(int[] arrays) {
        int[] counts = new int[arrays.length];
        for (int i = 0; i < counts.length; i++) {
            int count = 1;
            for (int j = i + 1; j < counts.length; j++) {
                if (arrays[i] == arrays[j]) {
                    count++;
                }
            }
            counts[i] = count;
        }
        int popularIndex = 0;
        int popularCounts = counts[0];
        for (int i = 1; i < counts.length; i++) {
            if (popularCounts < counts[i]) {
                popularCounts = counts[i];
                popularIndex = i;
            }
            if (popularCounts == counts[i] && arrays[i] < arrays[popularIndex]) {
                popularIndex = i;
            }
        }
        return arrays[popularIndex];
    }
}
