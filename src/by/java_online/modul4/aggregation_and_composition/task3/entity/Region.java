package by.java_online.modul4.aggregation_and_composition.task3.entity;

import java.util.ArrayList;
import java.util.List;

//область
public class Region {
    private String name;
    private City regionalCenter;
    private List<District> districtList;
    private int area = 0;

    public Region(String name, City regionalCenter) {
        this.name = name;
        this.regionalCenter = regionalCenter;
        districtList = new ArrayList<>();

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
        if (name != null ? !name.equals(region.name) : region.name != null) return false;
        if (regionalCenter != null ? !regionalCenter.equals(region.regionalCenter) : region.regionalCenter != null)
            return false;
        return districtList != null ? districtList.equals(region.districtList) : region.districtList == null;
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
