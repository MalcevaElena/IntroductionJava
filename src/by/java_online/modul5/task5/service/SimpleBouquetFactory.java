package by.java_online.modul5.task5.service;

import by.java_online.modul5.task5.bean.Bouquet;
import by.java_online.modul5.task5.bean.Flower;
import by.java_online.modul5.task5.bean.implFlower.Chrysanthemum;
import by.java_online.modul5.task5.bean.implFlower.Rose;
import by.java_online.modul5.task5.bean.implPack.Box;

public class SimpleBouquetFactory {

    public Bouquet createBouquet (){
        Bouquet bouquet = new Bouquet();

        return bouquet;
    }
}
