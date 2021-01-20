package Modul1.Branching;
/* Вычислить значение функции: */
public class Task5 {
    public static void main(String[] args) {
        int x = 3;
        double y;
        if (x<=3) {
            y = Math.pow(x,2)- 3*x+ 9;
        }
        else {
            y = 1 / (Math.pow(x, 3) + 6 );
        }
        System.out.println("Значение функции = " + y);
    }
}
