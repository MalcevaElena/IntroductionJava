package by.java_online.modul5.task5.bean.implPack;

import by.java_online.modul5.task5.bean.Pack;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Box implements Pack, Serializable {

    @Serial
    private static final long serialVersionUID = 6242616682659199710L;

    private String name = "Box";
    private int price = 50;

    public Box() {
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

        Box box = (Box) o;

        if (price != box.price) return false;
        return Objects.equals(name, box.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
