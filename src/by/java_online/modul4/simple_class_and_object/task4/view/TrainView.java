package by.java_online.modul4.simple_class_and_object.task4.view;

import by.java_online.modul4.simple_class_and_object.task4.entity.Train;

import java.util.List;

public class TrainView {

    public static void printTrain(List<Train> trains) {
        for (Train t : trains) {
            System.out.println(t);
        }
    }

    public static void printTrain(List <Train> trains, int number) {
        for (Train t : trains) {
            if (t.getTrainNumber()==number) {
                System.out.println(t);
                break;
            }
        }
    }

    public static void printTrainNumber(Train train) {
        System.out.print(train.getTrainNumber());
    }

}