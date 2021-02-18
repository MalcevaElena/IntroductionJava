package by.java_online.modul2.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2 {
    public static void main(String[] args) {
        int[] array = {12, 48, 18, 30};
        System.out.println("Даны четыре натуральных числа:");
        printArray(array);

        int nodArray = array[0];
        for (int i = 1; i < array.length; i++) {
            nodArray = nod(nodArray, array[i]);
        }
        System.out.println("Наибольший общий делитель данных чисел равен: " + nodArray);
    }

    public static int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("%2d\t", i);
        }
        System.out.println();
    }
}
