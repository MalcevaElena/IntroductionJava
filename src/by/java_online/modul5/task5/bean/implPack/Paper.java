package by.java_online.modul5.task5.bean.implPack;

import by.java_online.modul5.task5.bean.Pack;

import java.util.Objects;

public class Paper implements Pack {
    private String name = "Paper";
    private int price = 10;

    public Paper() {
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

        Paper paper = (Paper) o;

        if (price != paper.price) return false;
        return Objects.equals(name, paper.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

