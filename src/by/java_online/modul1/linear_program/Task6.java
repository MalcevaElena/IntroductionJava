package by.java_online.modul1.linear_program;

/* Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 */

public class Task6 {
    public static void main(String[] args) {
        int x;
        int y;

        x = 2;
        y = 4;

        System.out.println("Принадлежит ли закрашенной области, точка с координатами ("+x+", "+y+"):");

        if ((x >= -2 && x <= 2) && (y >= 0 && y <= 4) ||
                (x >= -4 && x <= 4) && (y >= -3 && y <= 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
