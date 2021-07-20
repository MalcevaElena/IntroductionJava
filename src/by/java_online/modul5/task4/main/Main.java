package by.java_online.modul5.task4.main;

import by.java_online.modul5.task4.bean.Cave;
import by.java_online.modul5.task4.bean.Treasure;
import by.java_online.modul5.task4.dao.DAOTreasure;
import by.java_online.modul5.task4.presentation.View;
import by.java_online.modul5.task4.service.ServiceTreasure;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int sum;
        List<Treasure> treasureList;
        List<Treasure> treasureWorth;

        DAOTreasure daoTreasure = new DAOTreasure();
        daoTreasure.openFile();
        treasureList = daoTreasure.readFile();
        daoTreasure.closeScanner();

        Cave caveTreasure = new Cave(treasureList);

        ServiceTreasure serviceTreasure = new ServiceTreasure();

        System.out.println("Все сокровища: ");
        View.showTreasure(caveTreasure.getTreasureList());

        System.out.println("Самое дорогое сокровище: ");
        Treasure mostExpensive = serviceTreasure.mostExpensive(caveTreasure.getTreasureList());
        View.showTreasure(mostExpensive);

        sum = 550;
        System.out.println("Сокровища на сумму не более " + sum + ":");
        treasureWorth = serviceTreasure.selectionTreasure(caveTreasure.getTreasureList(), sum);
        View.showTreasure(treasureWorth);
        System.out.println("Итого: " + serviceTreasure.cost(treasureWorth));
    }
}
