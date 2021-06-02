package by.java_online.modul4.simple_class_and_object.task4.entity;

import java.time.LocalTime;

public class Train {
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
    public String toString() {
        return "Пункт назначения: " + getDestination() +
                ", Номер поезда " + getTrainNumber() + ", Время отправления: " + getDepartureTime();
    }
    // equals and hashcode
}
