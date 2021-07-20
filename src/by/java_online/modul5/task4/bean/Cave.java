package by.java_online.modul5.task4.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cave {

    private String name = "Пещера дракона";
    private List <Treasure> treasureList;

    public Cave() {
        treasureList = new ArrayList<>();
    }

    public Cave(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    public Cave(String name, List<Treasure> treasureList) {
        this.name = name;
        this.treasureList = treasureList;
    }

    public String getName() {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public List<Treasure> getTreasureList() {
        return treasureList;
    }

    public void setTreasureList(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cave cave = (Cave) o;

        if (!Objects.equals(name, cave.name)) return false;
        return Objects.equals(treasureList, cave.treasureList);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (treasureList != null ? treasureList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cave{" +
                "name='" + name + '\'' +
                ", treasureList=" + treasureList +
                '}';
    }
}
