package by.java_online.modul4.simple_class_and_object.task6;

/* Составьте описание класса для представления времени.
 * Предусмотрите возможности установки времени и изменения его отдельных полей
 * (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class Main {
    public static void main(String[] args) {
        Time time = new Time(27, 66, 77);
        ShowTime.printTime(time);
        TimeLogic.settingHour(time, 2);
        ShowTime.printTime(time);
        TimeLogic.settingMinute(time, 04);
        ShowTime.printTime(time);
        TimeLogic.settingSecond(time, 45);
        ShowTime.printTime(time);
        TimeLogic.settingTime(time, 5, 40, 23);
        ShowTime.printTime(time);
    }
}
