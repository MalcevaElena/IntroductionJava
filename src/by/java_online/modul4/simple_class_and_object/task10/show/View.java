package by.java_online.modul4.simple_class_and_object.task10.show;

import by.java_online.modul4.simple_class_and_object.task10.entity.Airline;

import java.util.List;

public class View {
    public static void printAirline(List<Airline> airlines) {
        for (Airline air : airlines) {
            System.out.println(air);
        }
    }
}
