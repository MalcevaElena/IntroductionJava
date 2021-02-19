package by.java_online.modul1.linear_program;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Task5 {
    public static void main(String[] args) {
        int time;
        int hours;
        int minutes;
        int seconds;

        time = 3665;
        hours = time / 3600;
        minutes = (time % 3600) / 60;
        seconds = (time % 3600) % 60;

        System.out.println("Число Т = " + time);
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "c.");
    }
}