package by.java_online.modul4.aggregation_and_composition.task2.entity;

import java.util.Objects;

public class Motor {
    private int enginePower = 110;
    private String type = "Бензиновый";
    private static Motor motor;

    private Motor() {
    }

    private Motor(int enginePower) {
        if (enginePower > 80 && enginePower < 200) {
            this.enginePower = enginePower;
        } else {
            System.out.println("Ошибка, двигатель с данной мощностью не подходит для данного автомобиля.");
            System.out.println("Исключения еще не проходили.");
        }
    }

    private Motor(int enginePower, String type) {
        if (enginePower > 80 && enginePower < 200) {
            this.enginePower = enginePower;
        } else {
            System.out.println("Ошибка, двигатель с данной мощностью не подходит для данного автомобиля.");
            System.out.println("Исключения еще не проходили.");
        }
        this.type = type;
    }

    public static Motor getInstance() {
        if (motor == null) {
            motor = new Motor();
        }
        return motor;
    }

    public static Motor getInstance(int enginePower) {
        if (motor == null) {
            motor = new Motor(enginePower);
        }
        return motor;
    }

    public static Motor getInstance(int enginePower, String type) {
        if (motor == null) {
            motor = new Motor(enginePower, type);
        }
        return motor;
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

    public static Motor getMotor() {
        return motor;
    }

    public static void setMotor(Motor motor) {
        Motor.motor = motor;
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
