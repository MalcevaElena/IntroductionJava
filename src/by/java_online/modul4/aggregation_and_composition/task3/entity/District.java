package by.java_online.modul4.aggregation_and_composition.task3.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//район
public class District implements Serializable {
    @Serial
    private static final long serialVersionUID = -9215426132840507610L;

    private String name;
    private List<City> cityList;
    private double area;

    public District() {
    }

    public District(String name) {
        this.name = name;
        cityList = new ArrayList<City>();
    }

    public void add(City city) {
        cityList.add(city);
        this.area += city.getArea();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
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

        District district = (District) o;

        return Double.compare(district.area, area) == 0 &&
                Objects.equals(name, district.name) && Objects.equals(cityList, district.cityList);
    }

    @Override
    public int hashCode() {
        int prime = 37;
        int result = 17;
        long temp;
        result += prime * result + name.hashCode();
        temp = Double.doubleToLongBits(area);
        result += prime * result + (int) (temp ^ (temp >>> 32));
        result += prime * result + (cityList != null ? cityList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", cityList=" + cityList +
                ", area=" + area +
                '}';
    }
}
