package Modul2.OneArrays;
/*Даны действительные числа a1, a2, ... an. Найти
max( a1 + a2n, a2 + a2n−1,..., an + an+1)*/

public class Task7 {
        public static void main(String [] args) {
            int n = 5;
            double[] array = new double[2*n];
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.random()*25;
            }
            System.out.printf("Максимальное значение ( a1 + a2n, a2 + a2n−1,..., an + an+1) =  %.2f", maxSumArray(array));
        }
        public static double maxSumArray(double[] array){
            double maxSum = array[0] + array[array.length-1];
            for(int i = 1; i < array.length / 2; i++){
                if((array[i] + array[array.length - i - 1]) > maxSum){
                    maxSum = array[i] + array[array.length - i - 1];
                }
            }
            return maxSum;
        }
}

