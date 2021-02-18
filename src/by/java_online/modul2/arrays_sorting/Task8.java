package by.java_online.modul2.arrays_sorting;

/* Даны дроби p1/q1, p2/q2,... ,pn/qn (pi, qi - натуральные).
 * Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task8 {
    public static void main(String[] args) {
        int[] arrayP = {2, 5, 6, 3, 7, 1}; //массив числителей
        int[] arrayQ = {4, 6, 8, 3, 6, 2}; //массив знаменателей
        System.out.println("Даны дроби: ");
        printArray(arrayP, arrayQ);
        int nod = commonDenominator(arrayQ);
        System.out.println("Общий знаменатель: " + nod);
        numerator(arrayP, arrayQ, nod);
        sortArray(arrayP);
        System.out.println("Привести дроби к общему знаменателю, и упорядочить в порядке возрастания:");
        printArray(arrayP, nod);

    }

    public static int commonDenominator(int[] arr) {
        // Находим общий знаменатель
        int denominator = 1;
        for (int i = 0; i < arr.length; i++) {
            denominator = nok(denominator, arr[i]);
        }
        return denominator;
    }

    public static int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }

    public static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    public static void numerator(int[] one, int[] two, int denominator) {
        //приводим числители к общему знаменателю
        for (int i = 0; i < one.length; i++) {
            one[i] = denominator / two[i] * one[i];
        }
    }

    public static void sortArray(int[] one) {
        int tmp;
        for (int i = 0; i < one.length - 1; i++) {
            for (int j = one.length - 1; j > i; j--) {
                if (one[j - 1] > one[j]) {
                    tmp = one[j - 1];
                    one[j - 1] = one[j];
                    one[j] = tmp;
                }
            }
        }
    }

    public static void printArray(int[] arr, int one) {
        for (int i : arr) {
            System.out.printf("%2d/%d\t", i, one);
        }
        System.out.println();
    }

    public static void printArray(int[] arrP, int[] arrQ) {
        for (int i = 0; i < arrP.length; i++) {
            System.out.printf("%2d/%d\t", arrP[i], arrQ[i]);
        }
        System.out.println();
    }
}
