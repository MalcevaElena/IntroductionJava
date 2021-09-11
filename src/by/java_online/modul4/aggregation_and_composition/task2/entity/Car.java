package by.java_online.modul4.aggregation_and_composition.task2.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car implements Serializable {
    private final static int MAX_VOLUME_FUEL_TANK = 40;
    private int fuelQuantity = 0;
    private String carModel = "Lada";
    private List<Wheel> wheelList = new ArrayList<Wheel>();
    private Motor motor = new Motor (150);

    // Создаем автомобиль с 1 мотором и 4 колесами
    public Car() {
         for (int i = 0; i < 4; i++) {
            Wheel wheel = new Wheel();
            wheelList.add(wheel);
        }
    }

    public Car(int fuelQuantity) {
        this();
        if (fuelQuantity >= 1 && fuelQuantity <= MAX_VOLUME_FUEL_TANK) {
            this.fuelQuantity = fuelQuantity;
        }
    }

    public Car(String carModel) {
        this();
        this.carModel = carModel;
    }

    public Car(int fuelQuantity, String carModel) {
        this();
        if (fuelQuantity >= 1 && fuelQuantity <= MAX_VOLUME_FUEL_TANK) {
            this.fuelQuantity = fuelQuantity;
        }
        this.carModel = carModel;
    }

    public static int getMaxVolumeFuelTank() {
        return MAX_VOLUME_FUEL_TANK;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(int fuelQuantity) {
        if (fuelQuantity >= 1 && fuelQuantity <= MAX_VOLUME_FUEL_TANK) {
            this.fuelQuantity = fuelQuantity;
        }
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public List<Wheel> getWheelList() {
        return wheelList;
    }

    public void setWheelList(List<Wheel> wheelList) {
        this.wheelList = wheelList;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuelQuantity == car.fuelQuantity && Objects.equals(carModel, car.carModel)
                && Objects.equals(wheelList, car.wheelList) && Objects.equals(motor, car.motor);
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 17;
        result = prime * result + fuelQuantity;
        result = prime * result + carModel.hashCode();
        for (int i = 0; i < wheelList.size(); i++) {
            result = prime * result + wheelList.get(i).hashCode();
        }
        result = prime * result + motor.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car { fuelQuantity = " + fuelQuantity + ", carModel = " + carModel +
                ", wheelList = " + wheelList + ", motor = " + motor + " }";
    }
}
