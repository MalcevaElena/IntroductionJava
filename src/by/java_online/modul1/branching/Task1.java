package by.java_online.modul1.branching;

/* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */

public class Task1 {
    public static void main(String[] args) {
        double a = 45;
        double b = 45;
        if ((a + b) < 180) {
            System.out.println("Треугольник существует.");
            if (a == 90 || b == 90 || a + b == 90) {
                System.out.println("Треугольник прямоугольный.");
            } else {
                System.out.println("Треугольник непрямоугольный.");
            }
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}
