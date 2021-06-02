package by.java_online.modul4.simple_class_and_object.task4.main;

import by.java_online.modul4.simple_class_and_object.task4.entity.Depo;
import by.java_online.modul4.simple_class_and_object.task4.entity.Train;
import by.java_online.modul4.simple_class_and_object.task4.logic.TrainLogic;
import by.java_online.modul4.simple_class_and_object.task4.view.TrainView;

import java.util.List;
/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train,
 * добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

public class Main {
    public static void main(String[] args) {
        int numberUserInput;
        Depo depo = new Depo();

        depo.addTrains(new Train());
        depo.addTrains(new Train("Kemerovo", 875));
        depo.addTrains(new Train("Kemerovo", 478, 7, 30));
        depo.addTrains(new Train("Malinovka", 256, 4, 15));
        depo.addTrains(new Train("Malinovka", 176, 6, 30));

        System.out.println("Даны 5 поездов:");
        TrainView.printTrain(depo.getTrains());
        System.out.println("___");

        System.out.println("Отсортируем но номеру поезда:");
        List<Train> sorted;
        sorted = TrainLogic.sortTrainNumber(depo.getTrains());
        TrainView.printTrain(sorted);
        System.out.println("___");

        numberUserInput = UserInput.enterToConsole(depo.getTrains());
        System.out.println("Информация о поезде номер " + numberUserInput + ": ");
        TrainView.printTrain(depo.getTrains(), numberUserInput);
        System.out.println("___");

        System.out.println("Отсортируем поезда но пункту назначения:");
        List<Train> sortedDestination;
        sortedDestination = TrainLogic.sortDestination(depo.getTrains());
        TrainView.printTrain(sortedDestination);

    }
}
