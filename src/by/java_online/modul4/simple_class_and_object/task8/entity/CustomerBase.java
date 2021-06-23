package by.java_online.modul4.simple_class_and_object.task8.entity;

import java.util.List;

public class CustomerBase {
    private String nameGroup;
    private List<Customer> customerBase;

    public CustomerBase(List<Customer> customerBase) {
        this.nameGroup = "Покупатели для информационной рассылки";
        this.customerBase = customerBase;
    }

    public CustomerBase(String nameGroup, List<Customer> customerBase) {
        this.nameGroup = nameGroup;
        this.customerBase = customerBase;
    }

    public void addCustomerBase(String lastName, String firstName, String patronymic,
                                String address, int cardNumber, long bankAccountNumber) {
        this.customerBase.add(new Customer(lastName, firstName, patronymic, address, cardNumber, bankAccountNumber));
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public List<Customer> getCustomerBase() {
        return customerBase;
    }

    public void setCustomerBase(List<Customer> customerBase) {
        this.customerBase = customerBase;
    }
}
