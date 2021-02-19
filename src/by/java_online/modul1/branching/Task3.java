package by.java_online.modul1.branching;

/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 * Определить, будут ли они расположены на одной прямой.
 */

public class Task3 {
    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        int y1;
        int y2;
        int y3;
        int firstValue;
        int secondValue;

        x1 = 3;
        x2 = 5;
        x3 = 8;
        y1 = 6;
        y2 = 10;
        y3 = 16;

        firstValue = (x3 - x1) * (y2 - y1);
        secondValue = (y3 - y1) * (x2 - x1);

        if (firstValue == secondValue) {
            System.out.println("Три точки расположены на одной прямой.");
        } else {
            System.out.println("Три точки не расположены на одной прямой.");
        }
    }
}
