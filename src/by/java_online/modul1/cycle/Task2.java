package by.java_online.modul1.cycle;

/* Вычислить значения функции на отрезке [а,b] c шагом h:
 * y=x, x>2
 * y=-x, x<=2
 */

public class Task2 {
    public static void main(String[] args) {
        int a;
        int b;
        int h;
        int y;

        a = -6;
        b = 6;
        h = 2;

        System.out.println("Значение функции на отрезке [" + a + ", " + b + "] с шагом " + h + ":");

        for (int x = a; x <= b; x += h) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("f(" + x + ") = " + y);
        }
    }
}
