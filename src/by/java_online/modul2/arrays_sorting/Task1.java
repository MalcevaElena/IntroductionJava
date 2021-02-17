package by.java_online.modul2.arrays_sorting;
/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] arrayOne = {2, 4, 6, 7, 32, 56, 34, 1};
        int[] arrayTwo = {5, 88, 2};
        int k = 3;
        System.out.println("Даны 2 массива.");
        System.out.println("Массив один: ");
        printArray(arrayOne);
        System.out.println("Массив два:");
        printArray(arrayTwo);
        System.out.println("Объединить их в один массив, включив второй массив между k-м и (k+1). k=" + k);
        unionOfArray(arrayOne, arrayTwo, k);
    }

    public static void unionOfArray(int[] one, int[] two, int x) {
        int[] arrays = new int[one.length + two.length];
        for (int i = 0; i < arrays.length; i++) {
            if (i < x) { // записываем первый массив до К-го элемента
                arrays[i] = one[i];
            } else if (i == x) { // аписываем второй массив
                for (int j = 0; j < two.length; j++, i++) {
                    arrays[i] = two[j];
                }
            }
            if (i > x + two.length - 1) { // записываем остаток первого массива
                arrays[i] = one[i - two.length];
            }
        }
        printArray(arrays);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%2d\t", i);
        }
        System.out.println();
    }
}
