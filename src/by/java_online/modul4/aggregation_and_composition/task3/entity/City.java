package by.java_online.modul4.aggregation_and_composition.task3.entity;

import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable {
    private String name;
    private double area;

    public City() {
    }

    public City(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;
        return Objects.equals(name, city.name) && Double.compare(area, city.area) == 0;
    }

    @Override
    public int hashCode() {
        int prime = 37;
        int result = 17;
        long temp;
        result += prime * result + name.hashCode();
        temp = Double.doubleToLongBits(area);
        result += prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "City { name = '" + name + '\'' +
                ", area = " + area + '}';
    }
}
