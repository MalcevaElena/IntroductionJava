package by.java_online.modul4.simple_class_and_object.task10.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport implements Serializable {
    private String name;
    private List <Airline> baseAirline;

    public Airport(){
        this.baseAirline = new ArrayList<Airline>();
    }

    public Airport(String name, List<Airline> baseAirline) {
        this.name = name;
        this.baseAirline = baseAirline;
    }

    public void addAirline (String destination, int flightNumber,String aircraftType,
                            int departureTimeHour, int departureTimeMinute, DayOfWeek dayOfWeek){
        this.baseAirline.add(new Airline(destination, flightNumber, aircraftType,
                departureTimeHour, departureTimeMinute, dayOfWeek));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Airline> getBaseAirline() {
        return baseAirline;
    }

    public void setBaseAirline(List<Airline> baseAirline) {
        this.baseAirline = baseAirline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (!Objects.equals(name, airport.name)) return false;
        return Objects.equals(baseAirline, airport.baseAirline);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (baseAirline != null ? baseAirline.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", baseAirline=" + baseAirline +
                '}';
    }
}
