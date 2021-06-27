package by.java_online.modul4.simple_class_and_object.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Depo {
    private List<Train> trains;

    {
        trains = new ArrayList<>();
    }

    public Depo() {
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void addTrains(Train train) {
        trains.add(train);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Depo depo = (Depo) o;

        return trains != null ? trains.equals(depo.trains) : depo.trains == null;
    }

    @Override
    public int hashCode() {
        return trains != null ? trains.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Depo{" +
                "trains=" + trains +
                '}';
    }
}
