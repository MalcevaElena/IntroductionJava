package by.java_online.modul5.task5.service;

import by.java_online.modul5.task5.bean.Flower;
import by.java_online.modul5.task5.bean.implFlower.Chrysanthemum;
import by.java_online.modul5.task5.bean.implFlower.Rose;

import java.util.HashMap;
import java.util.Map;

public class FlowersCommand {
    private Map<String, Flower> commands;
    private static FlowersCommand instance;

    private FlowersCommand(){
        commands = new HashMap<String,Flower>();
        commands.put("rose", new Rose());
        commands.put("chrysanthemum", new Chrysanthemum());
    }

    public static FlowersCommand getInstance(){
        if (instance==null){
            instance=new FlowersCommand();
        }
        return instance;
    }

    public Flower getCommands (String commandName){
        Flower command = commands.get(commandName);
        return command;
    }
}
