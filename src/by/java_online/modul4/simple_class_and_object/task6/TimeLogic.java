package by.java_online.modul4.simple_class_and_object.task6;

public class TimeLogic {
    public static void settingHour(Time time, int number) {
        int hour = time.getHour() + number;
        while (hour > 23) {
            hour = hour - 24;
        }
        time.setHour(hour);
    }

    public static void settingMinute(Time time, int number) {
        int minute = time.getMinute() + number;
        while (minute > 59) {
            minute = minute - 60;
        }
        time.setMinute(minute);
    }

    public static void settingSecond(Time time, int number) {
        int second = time.getSecond() + number;
        while (second > 59) {
            second = second - 60;
        }
        time.setSecond(second);
    }

    public static void settingTime(Time time, int hour, int minute, int second) {
        int hours = time.getHour() + hour;
        int minutes = time.getMinute() + minute;
        int seconds = time.getSecond() + second;
        while (hours > 23) {
            hours = hours - 24;
        }
        while (minutes > 59) {
            minutes = minutes - 60;
        }
        while (seconds > 59) {
            seconds = seconds - 60;
        }
        time.setHour(hours);
        time.setMinute(minutes);
        time.setSecond(seconds);
    }
}
