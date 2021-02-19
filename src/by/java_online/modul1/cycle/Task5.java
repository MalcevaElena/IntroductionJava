package by.java_online.modul1.cycle;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид: (1/2^n) + (1/3^n)
 */

public class Task5 {
    public static void main(String[] args) {
        double e;
        double sum;
        double firstValue;
        double secondValue;

        e = 0.11;
        sum = 0;
        firstValue = 1 / 2.0;
        secondValue = 1 / 3.0;

        while (firstValue + secondValue >= e) {
            sum = sum + firstValue + secondValue;
            firstValue = firstValue / 2;
            secondValue = secondValue / 3;
        }
        System.out.printf("Сумма членов ряда, модуль которых больше или равен заданному е="
                + e + ", равна %.4f", sum);
    }
}
