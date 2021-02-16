package by.java_online.modul2.arrays_sorting;
/* Сортировка вставками.
 * Дана последовательность чисел a1, a2, ..., an.
 * Требуется переставить числа в порядке возрастания. Делается это следующим образом.
 * Пусть a1, a2,..., ai упорядоченная последовательность, т. е. a1 <= a2 <= an.
 * Берется следующее число ai+1 и вставляется в последовательность так,
 * чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор,
 * пока все элементы от ai+1 до an не будут перебраны.
 * Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] array = {4, 6, 23, 1, 56, 43};
        System.out.println("Дана последовательность: ");
        printArray(array);
        System.out.println("Отсортировать по возрастанию, сортировка Вставками: ");
        sortArray(array);
        printArray(array);
    }
    public static void sortArray (int [] arrays) {
        int i = 3; // первые 3 значения уже отсортированы
        int key;
        for (; i < arrays.length; i++) {
           //с помощью двоичного поиска, определяем в какую ячейку необходимо поместить эл-т
           int index = binarySearch(arrays, i-1,  arrays[i]);
           key = arrays[index]; // сохраняем значение переменной
           arrays [index] = arrays [i];
           int j = i - 1;
           while (j >= 0 && arrays[j] > arrays[index]) { //сдвигаем элементы на один вправо
                arrays[j + 1] = arrays[j];
                j --;
                }
           arrays[j + 1] = key; // в пустое место присваеваем значение сохраненной переменной
        }
    }
    public static int binarySearch(int arr[], int lastIndex, int elementToSearch) {
        int firstIndex = 0;
        if (elementToSearch < arr[firstIndex]) {
            return firstIndex;}
        if (elementToSearch > arr[lastIndex]){
            return lastIndex+1;}

        while(firstIndex <= lastIndex) {
            int middleIndex = firstIndex + (lastIndex-firstIndex)/2;
            if (elementToSearch >= arr[middleIndex] && elementToSearch < arr[middleIndex + 1])
                return middleIndex + 1;
            if (elementToSearch < arr[middleIndex])
                lastIndex = middleIndex - 1;
            if (elementToSearch > arr[middleIndex])
                firstIndex = middleIndex + 1;
        }
        return -1;
    }

    public static void printArray (int [] array) {
        for (int i: array) {
            System.out.printf("%2d\t",i);
        }
        System.out.println();
    }
}