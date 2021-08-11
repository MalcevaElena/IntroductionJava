package by.java_online.modul5.task5.bean.implFlower;

import by.java_online.modul5.task5.bean.Flower;

import java.util.Objects;

public class Rose implements Flower {
    private String name = "Rose";
    private int price = 120;

    public Rose() {
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

        Rose rose = (Rose) o;

        if (price != rose.price) return false;
        return Objects.equals(name, rose.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
