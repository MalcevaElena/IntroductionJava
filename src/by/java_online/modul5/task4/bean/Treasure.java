package by.java_online.modul5.task4.bean;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {

    @Serial
    private static final long serialVersionUID = -3443593963608432119L;
    private String name;
    private int cost;

    public Treasure() {
    }

    public Treasure(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Treasure treasure = (Treasure) o;

        if (cost != treasure.cost) return false;
        return Objects.equals(name, treasure.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
