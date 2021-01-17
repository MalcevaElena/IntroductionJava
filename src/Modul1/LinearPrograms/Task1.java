package Modul1.LinearPrograms;

/* Найдите значение функции:  z = ( (a – 3 ) * b / 2) + c.*/

public class Task1 {
    public static void main(String[] args) {
        double a = 4;
        double b = 5;
        double c = 2;

        double z = ((a - 3) * b / 2) + c;
        System.out.println("При a = " + a + ", b = " + b + " и c = " + c + " значение функции z = " + z);
    }
}