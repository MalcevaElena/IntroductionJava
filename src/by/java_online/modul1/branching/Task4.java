package by.java_online.modul1.branching;

/* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 *  Определить, пройдет ли кирпич через отверстие.
 */

public class Task4 {
    public static void main(String[] args) {
        int a;
        int b;
        int x;
        int y;
        int z;

        a = 10;
        b = 5;
        x = 6;
        y = 9;
        z = 3;

        if (x <= a && y <= b || y <= a && x <= b) {
            System.out.println("Пройдет стороной Х/Y");
        }
        if (x <= a && z <= b || z <= a && x <= b) {
            System.out.println("Пройдет стороной X/Z");
        }
        if (z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Пройдет стороной Z/Y");
        } else {
            System.out.println("Не пройдет");
        }
    }
}
