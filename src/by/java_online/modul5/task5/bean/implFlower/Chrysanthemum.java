package by.java_online.modul5.task5.bean.implFlower;

import by.java_online.modul5.task5.bean.Flower;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Chrysanthemum implements Flower, Serializable {

    @Serial
    private static final long serialVersionUID = -6346026671910633144L;

    private String name = "Chrysanthemum";
    private int price = 100;

    public Chrysanthemum() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chrysanthemum chrysanthemum = (Chrysanthemum) o;

        if (price != chrysanthemum.price) return false;
        return Objects.equals(name, chrysanthemum.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Chrysanthemum{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}