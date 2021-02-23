package by.java_online.modul2.decomposition;

/*  Задан массив D. Определить следующие суммы:
 * D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы
 * трех последовательно расположенных элементов массива с номерами от k до m.
 */

public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 41, 22, 63, 14, 35, 55};

        System.out.println("Дан массив:");
        printArray(array);

        System.out.println("Суммы трех последовательно расположенных элементов массива:");
        System.out.println("D[1] + D[2] + D[3] = " + sumElement(array, 1));
        System.out.println("D[3] + D[4] + D[5] = " + sumElement(array, 3));
        System.out.println("D[4] + D[5] + D[6] = " + sumElement(array, 4));

    }

    public static int sumElement(int[] arrays, int x) {
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += arrays[x + i];
        }
        return sum;
    }

    public static void printArray(int[] arrays) {
        for (int j : arrays) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
}
