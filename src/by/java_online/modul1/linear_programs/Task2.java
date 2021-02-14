package by.java_online.modul1.linear_programs;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения).

public class Task2 {
    public static void main(String[] args) {
        double a = 4;
        double b = 5;
        double c = 6;

        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)
                - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Значение выражения равно " + result);
    }
}
