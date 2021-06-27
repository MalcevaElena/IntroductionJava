package by.java_online.modul4.simple_class_and_object.task10.entity;

import java.util.List;

public class Airport {
    private String name;
    private List <Airline> baseAirline;

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

        if (name != null ? !name.equals(airport.name) : airport.name != null) return false;
        return baseAirline != null ? baseAirline.equals(airport.baseAirline) : airport.baseAirline == null;
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
