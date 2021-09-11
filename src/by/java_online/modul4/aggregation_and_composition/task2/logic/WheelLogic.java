package by.java_online.modul4.aggregation_and_composition.task2.logic;

import by.java_online.modul4.aggregation_and_composition.task2.entity.Car;
import by.java_online.modul4.aggregation_and_composition.task2.entity.Wheel;

public class WheelLogic {

    public static void changeWheel(Car car) {
        for (int i = 0; i < car.getWheelList().size(); i++) {
            if (!car.getWheelList().get(i).isWhole()) {
                car.getWheelList().remove(car.getWheelList().get(i));
                i--;
                Wheel wheel = new Wheel();
            }
        }
    }

    public static void changeWheel(Car car, int radius) {
        for (int i = 0; i < car.getWheelList().size(); i++) {
            if (!car.getWheelList().get(i).isWhole()) {
                car.getWheelList().remove(car.getWheelList().get(i));
                i--;
                Wheel wheel = new Wheel(radius);
            }
        }
    }

    public static void changeWheel(Car car, int radius, String material) {
        for (int i = 0; i < car.getWheelList().size(); i++) {
            if (!car.getWheelList().get(i).isWhole()) {
                car.getWheelList().remove(car.getWheelList().get(i));
                i--;
                Wheel wheel = new Wheel(radius, material);
            }
        }
    }

    public void spinWheel(Car car, int speed) {
        int rotation = 60;
        if (speed > 0) {
            for (int i = 0; i < car.getWheelList().size(); i++) {
                car.getWheelList().get(i).setRotationalSpeed(speed * rotation);
            }
        } else {
            System.out.println("Ошибка, скорость не может быть отрицательной.");
        }
    }
}
