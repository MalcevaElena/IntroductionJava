package by.java_online.modul2.array_sorting;

/* Даны дроби p1/q1, p2/q2,... ,pn/qn (pi, qi - натуральные).
 * Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task8 {

    public static void main(String[] args) {
        int nod;

        Fraction[] fractions = new Fraction[6];
        for (int i = 0; i < fractions.length; i++) {
            fractions[i] = new Fraction((int) (Math.random() * 8) + 1, (int) (Math.random() * 8 + 1));
        }

        System.out.println("Даны дроби: ");
        printArray(fractions);

        nod = commonDenominator(fractions);

        System.out.println("Общий знаменатель: " + nod);
        numerator(fractions, nod);
        sortArray(fractions);

        System.out.println("Привести дроби к общему знаменателю, и упорядочить в порядке возрастания:");
        printArray(fractions);

    }

    public static int commonDenominator(Fraction[] arr) {
        // Находим общий знаменатель
        int denom = 1;
        for (int i = 0; i < arr.length; i++) {
            denom = nok(denom, arr[i].denominator);
        }
        return denom;
    }

    public static int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }

    public static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    public static void numerator(Fraction[] fr, int nod) {
        //приводим числители к общему знаменателю
        for (int i = 0; i < fr.length; i++) {
            fr[i].numerator = nod / fr[i].denominator * fr[i].numerator;
            fr[i].denominator = nod;
        }
    }

    public static void sortArray(Fraction[] fract) {
        int tmp;
        for (int i = 0; i < fract.length - 1; i++) {
            for (int j = fract.length - 1; j > i; j--) {
                if (fract[j - 1].numerator > fract[j].numerator) {
                    tmp = fract[j - 1].numerator;
                    fract[j - 1].numerator = fract[j].numerator;
                    fract[j].numerator = tmp;
                }
            }
        }
    }

    public static void printArray(Fraction[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%2d/%d\t", arr[i].numerator, arr[i].denominator);
        }
        System.out.println();
    }
}

class Fraction {
    public int numerator;
    public int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
}

