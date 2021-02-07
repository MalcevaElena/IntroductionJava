package Modul2.OneArrays;
/*  Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/

public class Task3 {
    public static void main(String[] args) {
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0;
        int n = 20;
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int) (Math.random()* 10 - 5);
            if (array [i] > 0) {
                positiveNumber++;
            }
            else if (array [i] < 0) {
                negativeNumber++;
            }
            else {
                zeroNumber++;
            }
        }
        System.out.println("Массив действительных чисел:");
        for (int j: array) {
            System.out.print(j + ", ");
        }
        System.out.println();
        System.out.println("Отрицательных чисел: "+negativeNumber+"," +
                " положительных: "+positiveNumber+", и нулевых: "+ zeroNumber);
    }
}
