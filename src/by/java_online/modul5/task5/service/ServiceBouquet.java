package by.java_online.modul5.task5.service;

import by.java_online.modul5.task5.bean.Bouquet;
import by.java_online.modul5.task5.bean.Flower;
import by.java_online.modul5.task5.bean.implPack.Box;

public class ServiceBouquet {
    private SimpleBouquetFactory bouquetFactory;
    private SimpleFlowerFactory flowerFactory;

    public ServiceBouquet() {
        bouquetFactory = new SimpleBouquetFactory();
        flowerFactory = new SimpleFlowerFactory();
    }

    public ServiceBouquet(SimpleBouquetFactory bouquetFactory, SimpleFlowerFactory flowerFactory) {
        this.bouquetFactory = bouquetFactory;
        this.flowerFactory = flowerFactory;
    }

    public Bouquet orderBouquet() {
        Bouquet bouquet;

        bouquet = bouquetFactory.createBouquet();
        bouquet.addFlower(flowerFactory.createFlower("Rose"));
        bouquet.addFlower(flowerFactory.createFlower("Rose"));
        bouquet.addFlower(flowerFactory.createFlower("Chrysanthemum"));
        bouquet.addFlower(flowerFactory.createFlower("Chrysanthemum"));
        bouquet.addPack(new Box());

        return bouquet;
    }

    public int costBouquet (Bouquet bouquet){
        int cost = 0;
        for (Flower flower: bouquet.getFlowerList()) {
            cost+= flower.getPrice();
        }
        cost +=bouquet.getPack().getPrice();
        return cost;
    }


}
