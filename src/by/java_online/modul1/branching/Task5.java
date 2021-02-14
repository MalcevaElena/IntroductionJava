package by.java_online.modul1.branching;

/* Вычислить значение функции:
* x^2-3x+9, если x<=3
*  1 / (x^3 +6), если >3
*  */
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
