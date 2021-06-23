package by.java_online.modul4.simple_class_and_object.task5;

public class LogicCounter {

    public static int increment(int number, int max) {
        if (number == max) {
            return number;
        } else {
            return ++number;
        }
    }

    public static int decrement(int number, int min) {
        if (number == min) {
            return number;
        } else {
            return --number;
        }
    }
}
