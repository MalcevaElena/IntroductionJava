package by.java_online.modul5.task5.bean;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bouquet implements Serializable {

    @Serial
    private static final long serialVersionUID = 6718295237251154101L;

    List <Flower> flowerList;
    Pack pack;

    public Bouquet() {
       flowerList = new ArrayList<Flower>();
    }

    public Bouquet(List<Flower> flowerList, Pack pack) {
        this.flowerList = flowerList;
        this.pack = pack;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public void addFlower(Flower flower) {
        flowerList.add(flower);
    }

    public void addPack(Pack pack) {
       setPack(pack);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bouquet bouquet = (Bouquet) o;

        if (!Objects.equals(flowerList, bouquet.flowerList)) return false;
        return Objects.equals(pack, bouquet.pack);
    }

    @Override
    public int hashCode() {
        int result = flowerList != null ? flowerList.hashCode() : 0;
        result = 31 * result + (pack != null ? pack.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowerList=" + flowerList +
                ", pack=" + pack +
                '}';
    }
}
