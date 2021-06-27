package by.java_online.modul4.aggregation_and_composition.task2.main;
/* Создать объект класса Автомобиль,
 * используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

import by.java_online.modul4.aggregation_and_composition.task2.logic.CarLogic;
import by.java_online.modul4.aggregation_and_composition.task2.logic.MotorLogic;
import by.java_online.modul4.aggregation_and_composition.task2.logic.WheelLogic;
import by.java_online.modul4.aggregation_and_composition.task2.entity.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(10, "Volkswagen");

        WheelLogic wheelLogic = new WheelLogic();
        MotorLogic motorLogic = new MotorLogic(wheelLogic);
        CarLogic carLogic = new CarLogic(motorLogic);

        //заводим автомобиль, 1 передача, 2 передача.
        carLogic.drive(car, 1);
        carLogic.drive(car, 2);

        //Меняем колесо
        car.getWheelList().get(2).setWhole(false);
        wheelLogic.changeWheel(car);

        //Заправляем бак
        carLogic.refuelCar(car, 25);

        //Выводим на консоль марку автомобиля
        System.out.println(car.getCarModel());
    }
}
