package by.java_online.modul2.one_arrays;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Даны целые числа: ");
        int [] array = {3, 7, 1, 9, 4, 15, 32};
        for (int h: array) {
            System.out.print(h+", ");
        }
        System.out.println();
        int i = 8;
        System.out.println("Числа больше "+ i);
        for (int j = 0; j < array.length; j++) {
            if (array[j]>i){
                System.out.print(array[j]+", ");
            }
        }
    }
}
