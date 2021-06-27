package by.java_online.modul4.aggregation_and_composition.task2.logic;

import by.java_online.modul4.aggregation_and_composition.task2.entity.Car;

public class MotorLogic {
    private WheelLogic wheelLogic;

    public MotorLogic(WheelLogic wheelLogic) {
        this.wheelLogic = wheelLogic;
    }

    public void run(Car car, int speed) {

        wheelLogic.spinWheel(car, speed);
    }
}
