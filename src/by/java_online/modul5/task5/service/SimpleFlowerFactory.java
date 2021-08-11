package by.java_online.modul5.task5.service;

import by.java_online.modul5.task5.bean.Flower;
import by.java_online.modul5.task5.bean.implFlower.Chrysanthemum;
import by.java_online.modul5.task5.bean.implFlower.Rose;

public class SimpleFlowerFactory {
    Flower flower;

    public Flower createFlower (String name){
        if (name.equalsIgnoreCase("rose")){
            flower = new Rose();
        }
        else {
            flower = new Chrysanthemum();
        }
        return flower;
    }
}
