package by.java_online.modul2.one_array;

/* Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Task2 {
    public static void main(String[] args) {
        int z = 9;
        int count = 0;

        int[] array = {5, 16, 2, 8, 10, 7, 13, 45};

        System.out.println("Дана последовательность действительных числе: ");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }

        System.out.println("Число Z=" + z);

        System.out.println("Заменить все числа, больше чем Z:");
        printArray(array);

        System.out.println("Колличество замен: " + count);
    }

    public static void printArray(int[] arrays) {
        for (int j : arrays) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
}
