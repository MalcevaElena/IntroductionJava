package by.java_online.modul2.one_arrays;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {
    public static void main(String[] args) {
        int [] array = {3,5,8,10,13,15};
        int k = 5;
        int sum =0;
        for (int i =0; i< array.length; i++){
            if (array [i]%k==0) {
                sum+= array[i];
            }
        }
        System.out.println("Сумма элементов, кратных K = "+k+": "+sum);
    }
}
