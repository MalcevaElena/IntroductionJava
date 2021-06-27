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
        int speed = 0;
        switch (numberSpeedOnGearShift) {
            case 1:
                speed = 20;
                break;
            case 2:
                speed = 35;
                break;
            case 3:
                speed = 55;
                break;
            case 4:
                speed = 85;
                break;
            case 5:
                speed = 95;
                break;
            default:
                speed = 10;
        }
        motorLogic.run(car, speed);
    }

}
