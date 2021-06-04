package by.java_online.modul4.simple_class_and_object.task6;

public class Time {
    private int hour;
    private int minute;
    private int second;

    {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time() {
    }

    public Time(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public Time(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        if (minute < 0 || minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        if (minute < 0 || minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
        if (second < 0 || second > 59) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }
}
