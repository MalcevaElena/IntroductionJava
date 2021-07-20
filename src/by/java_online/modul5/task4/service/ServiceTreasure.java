package by.java_online.modul5.task4.service;

import by.java_online.modul5.task4.bean.Treasure;

import java.util.ArrayList;
import java.util.List;

public class ServiceTreasure {


    public Treasure mostExpensive(List<Treasure> treasureList) {
        Treasure expensiveTreasure = treasureList.get(0);
        for (Treasure treasure : treasureList) {
            if (treasure.getCost() > expensiveTreasure.getCost()) {
                expensiveTreasure = treasure;
            }
        }
        return expensiveTreasure;
    }

    public int cost(List<Treasure> treasureList) {
        int sum = 0;
        for (Treasure treasure : treasureList) {
            sum += treasure.getCost();
        }
        return sum;
    }

    public List<Treasure> selectionTreasure(List<Treasure> treasureList, int worth) {
        List<Treasure> treasureWorth = new ArrayList<>();

        for (int i = treasureList.size()-1; i >=0; i--) {
            int sum = cost(treasureWorth);
            if ((sum + treasureList.get(i).getCost()) <= worth) {
                treasureWorth.add(treasureList.get(i));
            }
        }
        return treasureWorth;
    }

}
