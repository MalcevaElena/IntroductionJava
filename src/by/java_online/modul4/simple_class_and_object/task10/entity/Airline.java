package by.java_online.modul4.simple_class_and_object.task10.entity;

import java.time.LocalTime;

public class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private LocalTime departureTime;
    private DayOfWeek dayOfWeek;

    public Airline(String destination, int flightNumber, String aircraftType,
                   int departureTimeHour, int departureTimeMinute, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = LocalTime.of(departureTimeHour, departureTimeMinute);
        this.dayOfWeek=dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTimeHour, int departureTimeMinute) {
        this.departureTime = LocalTime.of(departureTimeHour, departureTimeMinute);
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek=dayOfWeek;
    }

    @Override
    public String toString() {
        return String.format("Пункт назначения: %s, Номер рейса: %d, Тип самолета: %s," +
                        " Время вылета: %s, День недели: %s.", destination, flightNumber, aircraftType,
                departureTime, dayOfWeek);
    }
}
