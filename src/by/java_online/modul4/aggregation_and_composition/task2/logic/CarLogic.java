package by.java_online.modul4.aggregation_and_composition.task2.logic;

import by.java_online.modul4.aggregation_and_composition.task2.entity.Car;

public class CarLogic {
    private MotorLogic motorLogic;

    public CarLogic(MotorLogic motorLogic) {
        this.motorLogic = motorLogic;
    }

    public void refuelCar(Car car, int fuelQuantity) {
        int result = fuelQuantity + car.getFuelQuantity();
        if (result <= car.getMaxVolumeFuelTank()) {
            car.setFuelQuantity(result);
        } else {
            car.setFuelQuantity(Car.getMaxVolumeFuelTank());
        }
    }

    public void drive(Car car, int numberSpeedOnGearShift) {
        int speed = switch (numberSpeedOnGearShift) {
            case 1 -> 20;
            case 2 -> 35;
            case 3 -> 55;
            case 4 -> 85;
            case 5 -> 95;
            default -> 10;
        };
        motorLogic.run(car, speed);
    }

}
