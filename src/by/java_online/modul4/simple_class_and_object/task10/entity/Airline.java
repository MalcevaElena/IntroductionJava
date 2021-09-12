package by.java_online.modul4.simple_class_and_object.task10.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

public class Airline implements Serializable {
    @Serial
    private static final long serialVersionUID = -5342124791904629624L;

    private String destination;
    private int flightNumber;
    private String aircraftType;
    private LocalTime departureTime;
    private DayOfWeek dayOfWeek;

    public Airline(){

    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airline airline = (Airline) o;

        if (flightNumber != airline.flightNumber) return false;
        if (!Objects.equals(destination, airline.destination)) return false;
        if (!Objects.equals(aircraftType, airline.aircraftType)) return false;
        if (!Objects.equals(departureTime, airline.departureTime)) return false;
        return dayOfWeek == airline.dayOfWeek;
    }

    @Override
    public int hashCode() {
        int result = destination != null ? destination.hashCode() : 0;
        result = 31 * result + flightNumber;
        result = 31 * result + (aircraftType != null ? aircraftType.hashCode() : 0);
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (dayOfWeek != null ? dayOfWeek.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Пункт назначения: %s, Номер рейса: %d, Тип самолета: %s," +
                        " Время вылета: %s, День недели: %s.", destination, flightNumber, aircraftType,
                departureTime, dayOfWeek);
    }
}
