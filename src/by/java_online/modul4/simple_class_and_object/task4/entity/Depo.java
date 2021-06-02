package by.java_online.modul4.simple_class_and_object.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Depo {
    private List<Train> trains;
    {
        trains = new ArrayList<Train>();
    }

    public Depo() {
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void addTrains(Train train) {
        trains.add(train);
    }
    // equals, hashcode, toString

}
