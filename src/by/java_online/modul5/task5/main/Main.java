package by.java_online.modul5.task5.main;

import by.java_online.modul5.task5.bean.Bouquet;
import by.java_online.modul5.task5.bean.Flower;
import by.java_online.modul5.task5.bean.implFlower.Rose;
import by.java_online.modul5.task5.presentation.View;
import by.java_online.modul5.task5.service.ServiceBouquet;
import by.java_online.modul5.task5.service.SimpleBouquetFactory;

public class Main {
    public static void main(String[] args) {
        int cost;
        ServiceBouquet serviceBouquet = new ServiceBouquet();
        View view = new View();
        Bouquet bouquet = serviceBouquet.orderBouquet();

        view.printBouquet(bouquet);

        cost = serviceBouquet.costBouquet(bouquet);
        view.printCostBouquet(cost);
    }
}
