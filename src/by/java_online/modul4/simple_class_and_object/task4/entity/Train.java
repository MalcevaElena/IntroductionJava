package by.java_online.modul4.simple_class_and_object.task4.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

public class Train implements Serializable {
    @Serial
    private static final long serialVersionUID = 8039456960860565942L;

    private String destination;
    private int trainNumber;
    private LocalTime departureTime;

    public Train() {
        this.destination = "Novokuznetsk";
        this.trainNumber = 123;
        this.departureTime = LocalTime.of(0, 0);
    }

    public Train(String destination, int trainNumber) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = LocalTime.of(3, 40);
    }

    public Train(String destination, int trainNumber, int departureTimeHour, int departureTimeMinute) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = LocalTime.of(departureTimeHour, departureTimeMinute);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTimeHour, int departureTimeMinute) {
        this.departureTime = LocalTime.of(departureTimeHour, departureTimeMinute);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (trainNumber != train.trainNumber) return false;
        if (!Objects.equals(destination, train.destination)) return false;
        return Objects.equals(departureTime, train.departureTime);
    }

    @Override
    public int hashCode() {
        int result = destination != null ? destination.hashCode() : 0;
        result = 31 * result + trainNumber;
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Пункт назначения: " + getDestination() +
                ", Номер поезда " + getTrainNumber() + ", Время отправления: " + getDepartureTime();
    }

}
