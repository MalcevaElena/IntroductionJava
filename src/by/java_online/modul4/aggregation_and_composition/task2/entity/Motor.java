package by.java_online.modul4.aggregation_and_composition.task2.entity;

import java.io.Serializable;
import java.util.Objects;

public class Motor implements Serializable {
    private int enginePower;
    private String type;

    {
        enginePower = 110;
        type = "Бензиновый";
    }

    public  Motor() {}
    public Motor(int enginePower) {
        if (enginePower > 80 && enginePower < 200) {
            this.enginePower = enginePower;
        } else {
            System.out.println("Ошибка, двигатель с данной мощностью не подходит для данного автомобиля.");
            System.out.println("Исключения еще не проходили.");
        }
    }

    public Motor(int enginePower, String type) {
        this (enginePower);
        this.type = type;
    }


    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return enginePower == motor.enginePower && Objects.equals(type, motor.type);
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 17;
        result = prime * result + enginePower;
        result = prime * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Motor { enginePower = " + enginePower + ", type = " + type + " }";
    }
}
