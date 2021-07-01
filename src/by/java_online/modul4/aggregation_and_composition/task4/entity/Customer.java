package by.java_online.modul4.aggregation_and_composition.task4.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private String fullName;
    private int age;
    private List<Account> accounts;

    public Customer(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        this.accounts = new ArrayList<>();
    }

    public void add(Account account) {
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (age != customer.age) return false;
        return Objects.equals(fullName, customer.fullName) && Objects.equals(accounts, customer.accounts);
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
