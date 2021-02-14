package by.java_online.modul2.one_arrays;

/* Дан целочисленный массив с количеством элементов п.
 * Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 */

public class Task10 {
    public static void main(String[] args) {
        int n =10;
        int [] array = new  int[n];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int) (Math.random()*99);
        }
        System.out.println("Дан целочисленный массив с количеством элементов - "+n);
        printArray(array);
        System.out.println("Сжатый массив: ");
        printArray(reducedArray(array));
    }
    public static void printArray(int [] ar){
        for (int j: ar) {
            System.out.print(j + ", "); }
        System.out.println();
    }
    public static int [] bubbleSort (int [] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]==0) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;}
            }
        }
    return arr;
    }
    public static int [] reducedArray (int [] arrays){
        for (int i = 1; i < arrays.length ; i+=2) {
             arrays [i] = 0;}
    bubbleSort(arrays);
    return arrays;
    }
}
