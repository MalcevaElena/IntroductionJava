package by.java_online.modul4.simple_class_and_object.task10.logic;
/* Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import by.java_online.modul4.simple_class_and_object.task10.entity.Airline;
import by.java_online.modul4.simple_class_and_object.task10.entity.Airport;
import by.java_online.modul4.simple_class_and_object.task10.entity.DayOfWeek;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirlineLogic {

    public static List<Airline> destinationAirline(String destination, List<Airline> airlines) {
        List<Airline> destinationAirline = new ArrayList<>();
        for (int i = 0; i < airlines.size(); i++) {
            if (airlines.get(i).getDestination().equalsIgnoreCase(destination)) {
                destinationAirline.add(airlines.get(i));
            }
        }
        return destinationAirline;
    }

    public static List<Airline> dayOfWeekAirline(DayOfWeek day, List<Airline> airlines) {
        List<Airline> dayOfWeekAirline = new ArrayList<>();
        for (int i = 0; i < airlines.size(); i++) {
            if (Objects.equals(airlines.get(i).getDayOfWeek(), day)) {
                dayOfWeekAirline.add(airlines.get(i));
            }
        }
        return dayOfWeekAirline;
    }

    public static List<Airline> dayOfWeekAirlineAndTime(DayOfWeek day, LocalTime time, List<Airline> airlines) {
        int timeOne = time.getHour() * 60 + time.getMinute();
        int timeTwo;
        List<Airline> dayOfWeekAirlineAndTime = new ArrayList<>();
        List<Airline> dayOfWeekAirline = dayOfWeekAirline(day, airlines);
        for (int i = 0; i < dayOfWeekAirline.size(); i++) {
            timeTwo = dayOfWeekAirline.get(i).getDepartureTime().getHour() * 60 + dayOfWeekAirline.get(i).getDepartureTime().getMinute();
            if (timeTwo > timeOne) {
                dayOfWeekAirlineAndTime.add(dayOfWeekAirline.get(i));
            }
        }
        return dayOfWeekAirlineAndTime;
    }
}
