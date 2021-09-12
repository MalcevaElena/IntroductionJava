package by.java_online.modul4.aggregation_and_composition.task3.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//область
public class Region implements Serializable {
    @Serial
    private static final long serialVersionUID = 4806237410802516599L;

    private String name;
    private City regionalCenter;
    private List<District> districtList;
    private int area;

    public Region() {
    }

    public Region(String name, City regionalCenter) {
        this.name = name;
        this.regionalCenter = regionalCenter;
        districtList = new ArrayList<District>();

    }

    public void add(District district) {
        districtList.add(district);
        area += district.getArea();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
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

        Region region = (Region) o;

        if (area != region.area) return false;
        if (!Objects.equals(name, region.name)) return false;
        if (!Objects.equals(regionalCenter, region.regionalCenter)) return false;
        return Objects.equals(districtList, region.districtList);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (regionalCenter != null ? regionalCenter.hashCode() : 0);
        result = 31 * result + (districtList != null ? districtList.hashCode() : 0);
        result = 31 * result + area;
        return result;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", regionalCenter='" + regionalCenter + '\'' +
                ", districtList=" + districtList +
                ", area=" + area +
                '}';
    }
}
