package by.java_online.modul1.cycles;

/* Вычислить значения функции на отрезке [а,b] c шагом h:
 * y=x, x>2
 * y=-x, x<=2
 */

public class Task2 {
    public static void main(String[] args) {
        int a = -6;
        int b = 6;
        double h = 2;
        double x;
        double y;
        for (double i = a; i <= b; i += h) {
            x = i;
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("Значение функции на отрезке [" + a + ", " + b + "] = " + y);
        }
    }
}
