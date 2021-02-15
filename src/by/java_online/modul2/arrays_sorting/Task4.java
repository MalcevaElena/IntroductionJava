package by.java_online.modul2.arrays_sorting;
/* Сортировка обменами.
 * Дана последовательность чисел: a1, a2, ..., an.
 * Требуется переставить числа в порядке возрастания.
 * Для этого сравниваются два соседних числа ai и аi+1.
 * Если ai > ai+1, то делается перестановка.
 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {4, 6, 23, 65, 1, 43, 8, 66, 92, 5, 2};
        System.out.println("Дана последовательность: ");
        printArray(array);
        System.out.println("Отсортировать по возрастанию, сортировка Обменами: ");
        sortArray(array);
        printArray(array);
    }
    public static void sortArray (int [] arrays) {
        int count = 0;
        int temp;
        for (int i = 0; i < arrays.length-1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] < arrays[i]) {
                    temp = arrays[j];
                    arrays [j] = arrays [i];
                    arrays [i] = temp;
                    count++;}
            }
        }
        System.out.println("Количество перестановок: "+ count);
    }
    public static void printArray (int [] array) {
        for (int i: array) {
            System.out.printf("%2d\t",i);
        }
        System.out.println();
    }
}