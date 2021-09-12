package by.java_online.modul5.task5.service;

import by.java_online.modul5.task5.bean.Flower;
import by.java_online.modul5.task5.bean.implFlower.Chrysanthemum;
import by.java_online.modul5.task5.bean.implFlower.Rose;

import java.util.Locale;

public class SimpleFlowerFactory {
    Flower flower;
    FlowersCommand command = FlowersCommand.getInstance();

    public Flower createFlower (String name){
        flower = command.getCommands(name.toLowerCase(Locale.ROOT));
        return flower;
    }
}
