package by.java_online.modul1.branching;

/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 * Определить, будут ли они расположены на одной прямой.
 */

public class Task3 {
    public static void main(String[] args) {
        int x1 = 3;
        int x2 = 5;
        int x3 = 8;
        int y1 = 6;
        int y2 = 10;
        int y3 = 16;
        int firstValue = (x3 - x1) * (y2 - y1);
        int secondValue = (y3 - y1) * (x2 - x1);
        if (firstValue == secondValue) {
            System.out.println("Три точки расположены на одной прямой.");
        } else {
            System.out.println("Три точки не расположены на одной прямой.");
        }
    }
}
