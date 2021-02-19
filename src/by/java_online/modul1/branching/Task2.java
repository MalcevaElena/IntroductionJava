package by.java_online.modul1.branching;

//  Найти max{min(a, b), min(c, d)}.

public class Task2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        a = 9;
        b = 4;
        c = 6;
        d = 8;

        System.out.println("max(min(" + a + ", " + b + "),min(" + c + ", " + d + ")) = "
                + max(min(a, b), min(c, d)));
    }

    public static int min(int x, int y) {
        if (x <= y) {
            return x;
        } else {
            return y;
        }
    }

    public static int max(int z, int s) {
        if (z >= s) {
            return z;
        } else {
            return s;
        }
    }
}
