package by.java_online.modul4.aggregation_and_composition.task3.view;

import by.java_online.modul4.aggregation_and_composition.task3.entity.City;
import by.java_online.modul4.aggregation_and_composition.task3.entity.District;
import by.java_online.modul4.aggregation_and_composition.task3.entity.Region;
import by.java_online.modul4.aggregation_and_composition.task3.entity.State;

//ывести на консоль столицу, количество областей, площадь, областные центры.
public class Show {
    public void printCapital (State state) {
        System.out.println("Столица: "+ state.getCapital());
    }

    public void printNumberRegion(State state) {
        System.out.println("В стране "+ state.getName()+ " количество областей:"+ state.getNumberOfRegion());
    }

    public void printArea (State state){
        System.out.println("Площадь страны: "+ state.getArea());
    }

    public void printArea (Region region){
        System.out.println("Площадь области: "+region.getName()+": "+ region.getArea());
    }
    public void printArea (District district){
        System.out.println("Площадь района: "+ district.getName()+": "+ district.getArea());
    }
    public void printArea (City city){
        System.out.println("Площадь города: "+ city.getName()+": "+city.getArea());
    }

    public void printRegionalCenter (Region region){
        System.out.println("Региональный центр "+ region.getName() +":"+region.getRegionalCenter().getName());
    }
}
