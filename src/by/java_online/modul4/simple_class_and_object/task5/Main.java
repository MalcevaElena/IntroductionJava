package by.java_online.modul4.simple_class_and_object.task5;

/* Опишите класс, реализующий десятичный счетчик,
 * который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния,
 * и метод позволяющее получить его текущее состояние.
 * Написать код, демонстрирующий все возможности класса.
 */

public class Main {
    public static void main(String[] args) {
        int min = 10;
        int max = 50;

        Counter decimalCounter = new Counter(min);
        Show.showCounter(decimalCounter);
        decimalCounter.setCounter(LogicCounter.increment(decimalCounter.getCounter(),max));
        Show.showCounter(decimalCounter);
        decimalCounter.setCounter (LogicCounter.decrement((decimalCounter.getCounter()),min));
        Show.showCounter(decimalCounter);
        decimalCounter.setCounter (LogicCounter.decrement((decimalCounter.getCounter()),min));
        Show.showCounter(decimalCounter);
    }
}
