package by.java_online.modul2.decomposition;

/*
 Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
 */
public class Task01 {
    public static void main(String[] args) {
        int a = 7;
        int b = 15;

        int nod;
        int nok;

        nod = nod(a, b);
        nok = nok(a, b);

        System.out.println("НОД и НОК для числе a="+a+" и b="+b+
                ", равны " + nod + " и " + nok + " соответственно.");
    }

    public static int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }

    public static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }
}
