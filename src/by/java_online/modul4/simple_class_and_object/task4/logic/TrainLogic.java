package by.java_online.modul4.simple_class_and_object.task4.logic;

import by.java_online.modul4.simple_class_and_object.task4.entity.Train;

import java.util.*;

public class TrainLogic {

    public static List<Train> sortTrainNumber(List<Train> trains) {
        List<Train> sortTrain = new ArrayList<Train>();
        sortTrain.addAll(trains);
        Train tpm;
        for (int i = 0; i < sortTrain.size(); i++) {
            for (int j = sortTrain.size() - 1; j > i; j--) {
                if (sortTrain.get(i).getTrainNumber() > sortTrain.get(j).getTrainNumber()) {
                    tpm = sortTrain.get(j);
                    sortTrain.set(j, sortTrain.get(i));
                    sortTrain.set(i, tpm);
                }
            }
        }
        return sortTrain;
    }

    public static boolean findByNumber(int findNumber, List<Train> trains) {
        for (int i = 0; i < trains.size(); i++) {
            if (trains.get(i).getTrainNumber() == findNumber) {
                return true;
            }
        }
        System.out.println("Поезда с таким номером не существует.");
        System.out.println();
        return false;
    }

    public static List<Train> sortDestination(List<Train> trains) {
        List<Train> sortTrain = new ArrayList<Train>();
        sortTrain.addAll(trains);

        int timeOne = 0;
        int timeTwo = 0;
        Train tpm;

        // сортировка по пункту назначения
        for (int i = 0; i < sortTrain.size() - 1; i++) {
            for (int j = sortTrain.size() - 1; j > i; j--) {

                if (sortTrain.get(i).getDestination().length()
                        < sortTrain.get(j).getDestination().length()) {

                    for (int k = 0; k < sortTrain.get(i).getDestination().length(); k++) {
                        if (sortTrain.get(i).getDestination().charAt(k) >
                                sortTrain.get(j).getDestination().charAt(k)) {
                            tpm = sortTrain.get(i);
                            sortTrain.set(i, sortTrain.get(j));
                            sortTrain.set(j, tpm);
                            break;
                        } else if (sortTrain.get(i).getDestination().charAt(k) <
                                sortTrain.get(j).getDestination().charAt(k)) {
                            break;
                        }
                    }

                } else {
                    for (int k = 0; k < sortTrain.get(j).getDestination().length(); k++) {
                        if (sortTrain.get(j).getDestination().charAt(k)
                                < sortTrain.get(i).getDestination().charAt(k)) {
                            tpm = sortTrain.get(j);
                            sortTrain.set(j, sortTrain.get(i));
                            sortTrain.set(i, tpm);
                            break;
                        } else if (sortTrain.get(j).getDestination().charAt(k)
                                > sortTrain.get(i).getDestination().charAt(k)) {
                            break;
                        }
                    }
                }
            }
        }

        //сортировка по времени отправления у поездов с одинаковым пунктом назначения
        for (int i = 0; i < sortTrain.size() - 1; i++) {
            for (int j = i + 1; j < sortTrain.size(); j++) {

                if (sortTrain.get(i).getDestination() == sortTrain.get(j).getDestination()) {
                    timeOne = sortTrain.get(i).getDepartureTime().getHour() * 60 + sortTrain.get(i).getDepartureTime().getMinute();
                    timeTwo = sortTrain.get(j).getDepartureTime().getHour() * 60 + sortTrain.get(j).getDepartureTime().getMinute();
                    if (timeOne > timeTwo) {
                        tpm = sortTrain.get(i);
                        sortTrain.set(i, sortTrain.get(j));
                        sortTrain.set(j, tpm);
                    }
                } else {
                    break;

                }
            }
        }
        return sortTrain;
    }
}
