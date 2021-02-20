package by.java_online.modul2.array_sorting;

/* Гномья сортировка.
 * Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1.
 * Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai >= ai+1, то производится перестановка
 * и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */

public class Task6 {
    public static void main(String[] args) {
        double[] array = {5, 7.3, 2, 1, 9.5, 65, 8};

        System.out.println("Дан массив действительных чисел:");
        printArray(array);

        System.out.println("Упорядочить его по возрастанию, Гномья сортировка:");
        sortArray(array);
        printArray(array);
    }

    public static void sortArray(double[] arrays) {
        int i = 1; // идекс текущей проверки эл-тов
        int j = 2; // индекс уже отсортированных эл-тов, для возврата
        double temp;

        while (i < arrays.length) {
            if (arrays[i - 1] < arrays[i]) {
                i = j;
                j++;
            } else {
                temp = arrays[i];
                arrays[i] = arrays[i - 1];
                arrays[i - 1] = temp;
                i--;
                if (i == 0) {
                    i = j;
                    j++;
                }
            }
        }
    }

    public static void printArray(double[] arr) {
        for (double i : arr) {
            System.out.printf("%7.2f", i);
        }
        System.out.println();
    }
}
