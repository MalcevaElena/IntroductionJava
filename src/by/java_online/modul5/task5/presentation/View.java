package by.java_online.modul5.task5.presentation;

import by.java_online.modul5.task5.bean.Bouquet;
import by.java_online.modul5.task5.bean.Flower;

public class View {

    public void printBouquet(Bouquet bouquet){
        System.out.println("Букет состоит из следующих цветов:");
        for (Flower flower: bouquet.getFlowerList()) {
            System.out.print(flower.getName()+ ", ");
        }
        System.out.println("упакованных в "+ bouquet.getPack().getName());

    }
    public void printCostBouquet (int cost) {
        System.out.println("Стоимость букета = "+ cost);
    }
}
