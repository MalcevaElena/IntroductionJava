package by.java_online.modul4.aggregation_and_composition.task3.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State implements Serializable {
    private String name;
    private String capital;
    private List<Region> regionList;
    private int numberOfRegion;
    private int area;

    public State() {
    }

    public State(String name, String capital) {
        this.name = name;
        this.capital = capital;
        regionList = new ArrayList<Region>();

    }

    public void add(Region region) {
        regionList.add(region);
        numberOfRegion++;
        area += region.getArea();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

    public int getNumberOfRegion() {
        return numberOfRegion;
    }

    public void setNumberOfRegion(int numberOfRegion) {
        this.numberOfRegion = numberOfRegion;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        State state = (State) o;

        if (numberOfRegion != state.numberOfRegion) return false;
        if (area != state.area) return false;
        if (!Objects.equals(name, state.name)) return false;
        if (!Objects.equals(capital, state.capital)) return false;
        return Objects.equals(regionList, state.regionList);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + (regionList != null ? regionList.hashCode() : 0);
        result = 31 * result + numberOfRegion;
        result = 31 * result + area;
        return result;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", regionList=" + regionList +
                ", numberOfRegion=" + numberOfRegion +
                ", area=" + area +
                '}';
    }
}
