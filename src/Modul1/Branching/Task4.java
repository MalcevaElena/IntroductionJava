package Modul1.Branching;
/*. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.*/

public class Task4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int x = 6;
        int y = 9;
        int z = 3;
        if (x <= a && y <= b || y <= a && x <= b) {
            System.out.println("Пройдет стороной Х/Y");
        }
        if (x <= a && z <= b || z <= a && x <= b ) {
            System.out.println("Пройдет стороной X/Z");
        }
        if (z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Пройдет стороной Z/Y");
        }
        else {
            System.out.println("Не пройдет");
        }
    }
}
