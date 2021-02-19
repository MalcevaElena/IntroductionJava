package by.java_online.modul1.linear_program;

// Найдите значение функции:  z = ( (a – 3 ) * b / 2) + c.

public class Task1 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;

        a = 5;
        b = 4;
        c = 3;

        z = ((a - 3) * b / 2) + c;

        System.out.println("При a = " + a + ", b = " + b + " и c = " + c + " значение функции z = " + z);
    }
}