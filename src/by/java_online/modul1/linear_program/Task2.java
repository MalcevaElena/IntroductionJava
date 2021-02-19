package by.java_online.modul1.linear_program;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 (b+sqrt(b^2+4ac))/2a-a^3c+b^-2
 */

public class Task2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double result;

        a = 2;
        b = 6;
        c = 3;

        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a -
                Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.printf("Значение выражения равно %.2f", + result);
    }
}
