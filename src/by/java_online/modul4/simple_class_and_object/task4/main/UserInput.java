package by.java_online.modul4.simple_class_and_object.task4.main;

import by.java_online.modul4.simple_class_and_object.task4.logic.TrainLogic;
import by.java_online.modul4.simple_class_and_object.task4.view.TrainView;
import by.java_online.modul4.simple_class_and_object.task4.entity.Train;

import java.util.List;
import java.util.Scanner;

public class UserInput {

    public static int enterToConsole(List<Train> trains) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("Выберите и введите номер поезда: ");
            for (int i = 0; i < trains.size(); i++) {
                if (i == 0) {
                    System.out.print("[");
                }
                TrainView.printTrainNumber(trains.get(i));
                if (i < trains.size() - 1) {
                    System.out.print(", ");
                }
                if (i == trains.size() - 1) {
                    System.out.println("]");
                }
            }
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число. Повторите попытку.");
                sc.next();
            }
            number = sc.nextInt();
        }
        while (!TrainLogic.findByNumber(number, trains));

        return number;
    }

}
