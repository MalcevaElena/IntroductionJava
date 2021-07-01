package by.java_online.modul4.aggregation_and_composition.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String fullName;
    private int age;
    private List <Account> accounts;

    public Customer(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        this.accounts = new ArrayList<>();
    }
    public void add (Account account){
        this.accounts.add(account);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Account> getBankAccounts() {
        return accounts;
    }

    public void setBankAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (age != customer.age) return false;
        if (fullName != null ? !fullName.equals(customer.fullName) : customer.fullName != null) return false;
        return accounts != null ? accounts.equals(customer.accounts) : customer.accounts == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (accounts != null ? accounts.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer { fullName = " + fullName + ", age = " + age +
                ", accounts = " + accounts + '}';
    }
}
