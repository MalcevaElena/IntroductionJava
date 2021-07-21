package by.java_online.modul5.task4.presentation;

import by.java_online.modul5.task4.bean.Treasure;

import java.util.List;

public class View {

    public static void showTreasure(List<Treasure> treasureList) {
        for (Treasure treasure : treasureList) {
            System.out.println("Название сокровища: " + treasure.getName() + ", стоимость: " + treasure.getCost());
        }
        System.out.println();
    }

    public static void showTreasure(Treasure treasure) {
        System.out.println("Название сокровища: " + treasure.getName() + ", стоимость: " + treasure.getCost());
        System.out.println();
    }
}
