package by.java_online.modul4.aggregation_and_composition.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List <Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void add (Customer customer){
        this.customers.add(customer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getClients() {
        return customers;
    }

    public void setClients(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (name != null ? !name.equals(bank.name) : bank.name != null) return false;
        return customers != null ? customers.equals(bank.customers) : bank.customers == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (customers != null ? customers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bank { name = '" + name + '\'' + ", customers = " + customers + '}';
    }
}
