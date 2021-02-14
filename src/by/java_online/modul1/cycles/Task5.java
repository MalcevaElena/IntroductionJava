package by.java_online.modul1.cycles;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид: (1/2^n) + (1/3^n)
 */

public class Task5 {
    public static void main(String[] args) {
        double e = 0.11;
        double sum = 0;
        double firstValue = 1/2.0;
        double secondValue = 1/3.0;
        while (firstValue+secondValue>=e) {
               sum= sum + firstValue + secondValue;
               firstValue = firstValue/2;
               secondValue = secondValue/3;
        }
        System.out.println("Сумма членов ряда, модуль которых больше или равен заданному е="+e+", равна " + sum);
    }
}
