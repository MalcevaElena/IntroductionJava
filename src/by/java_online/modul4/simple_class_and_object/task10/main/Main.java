package by.java_online.modul4.simple_class_and_object.task10.main;

import by.java_online.modul4.simple_class_and_object.task10.entity.Airline;
import by.java_online.modul4.simple_class_and_object.task10.entity.Airport;
import by.java_online.modul4.simple_class_and_object.task10.entity.DayOfWeek;
import by.java_online.modul4.simple_class_and_object.task10.logic.AirlineLogic;
import by.java_online.modul4.simple_class_and_object.task10.show.View;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/* Создать класс Airline, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport("Спиченково", new ArrayList<Airline>());

        airport.addAirline("Москва", 123, "AirBus320",
                10, 30, DayOfWeek.ВОСКРЕСЕНЬЕ);
        airport.addAirline("Новосибирск", 453, "AirBus320",
                13, 50, DayOfWeek.СРЕДА);
        airport.addAirline("Томск", 736, "AirBus321",
                03, 30, DayOfWeek.СРЕДА);
        airport.addAirline("Омск", 983, "AirBus321",
                8, 25, DayOfWeek.ВТОРНИК);
        airport.addAirline("Ижевск", 145, "AirBus540",
                9, 50, DayOfWeek.ПЯТНИЦА);
        airport.addAirline("Нижний Новгород", 873, "AirBus540",
                7, 10, DayOfWeek.ПЯТНИЦА);
        airport.addAirline("Санкт-Петербург", 643, "AirBus540",
                4, 20, DayOfWeek.ВОСКРЕСЕНЬЕ);

        System.out.println("Список рейсов из аэропорта " + airport.getName());
        View.printAirline(airport.getBaseAirline());

        System.out.println();
        String s = "Ижевск";
        List<Airline> destinationAirline = AirlineLogic.destinationAirline(s, airport.getBaseAirline());
        System.out.println("Список рейсов из аэропорта " + airport.getName() + " в пункт назначения: " + s);
        View.printAirline(destinationAirline);


        System.out.println();
        DayOfWeek day = DayOfWeek.ПЯТНИЦА;
        List<Airline> dayOfWeekAirline = AirlineLogic.dayOfWeekAirline(day, airport.getBaseAirline());
        System.out.println("Список рейсов из аэропорта " + airport.getName() + " для заданного дня недели: " + day);
        View.printAirline(dayOfWeekAirline);

        DayOfWeek d = DayOfWeek.СРЕДА;
        LocalTime time = LocalTime.of(12, 00);
        System.out.println();
        List<Airline> dayOfWeekAirlineAndTime =
                AirlineLogic.dayOfWeekAirlineAndTime(d, time, airport.getBaseAirline());
        System.out.println("Список рейсов из аэропорта " + airport.getName() + " для заданного дня недели: " + d + " после " + time);
        View.printAirline(dayOfWeekAirlineAndTime);

    }

}
