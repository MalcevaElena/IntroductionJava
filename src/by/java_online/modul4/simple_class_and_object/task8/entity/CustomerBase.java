package by.java_online.modul4.simple_class_and_object.task8.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerBase implements Serializable {
    private String nameGroup;
    private List<Customer> customerBase;

    public CustomerBase () {
        this.customerBase = new ArrayList<Customer>();
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerBase that = (CustomerBase) o;

        if (!Objects.equals(nameGroup, that.nameGroup)) return false;
        return Objects.equals(customerBase, that.customerBase);
    }

    @Override
    public int hashCode() {
        int result = nameGroup != null ? nameGroup.hashCode() : 0;
        result = 31 * result + (customerBase != null ? customerBase.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomerBase{" +
                "nameGroup='" + nameGroup + '\'' +
                ", customerBase=" + customerBase +
                '}';
    }
}
