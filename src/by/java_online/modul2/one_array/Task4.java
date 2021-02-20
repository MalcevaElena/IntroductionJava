package by.java_online.modul2.one_array;

// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task4 {
    public static void main(String[] args) {
        int min;
        int indexMim;
        int max;
        int indexMax;
        int temp;

        int[] array = {3, 7, 1, 9, 4, 15, 32};

        System.out.println("Даны действительные числа: ");
        printArray(array);

        min = array[0];
        indexMim = 0;
        max = array[0];
        indexMax = 0;

        for (int i = 1; i < array.length; i++) { // находим мин и мах элементы и их индексы
            if (min > array[i]) {
                min = array[i];
                indexMim = i;
            }
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }

        temp = array[indexMim]; //меняем местами мин и мах элемент
        array[indexMim] = array[indexMax];
        array[indexMax] = temp;

        System.out.println("Действительные числа, после замены местами минимального" +
                " и максимального элементов: ");
        printArray(array);
    }

    public static void printArray(int[] arrays) {
        for (int j : arrays) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
}
