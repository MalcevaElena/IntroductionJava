package by.java_online.modul4.simple_class_and_object.task8.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
    @Serial
    private static final long serialVersionUID = -6222996042176909338L;

    private static int startID = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private int cardNumber;
    private long bankAccountNumber;

    public Customer (){
        this.id = startID++;
    }

    Customer(String lastName, String firstName, String patronymic, String address,
             int cardNumber, long bankAccountNumber) {
        this.id = startID++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (cardNumber != customer.cardNumber) return false;
        if (bankAccountNumber != customer.bankAccountNumber) return false;
        if (!Objects.equals(firstName, customer.firstName)) return false;
        if (!Objects.equals(lastName, customer.lastName)) return false;
        if (!Objects.equals(patronymic, customer.patronymic)) return false;
        return Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + cardNumber;
        result = 31 * result + (int) (bankAccountNumber ^ (bankAccountNumber >>> 32));
        return result;

    }

    @Override
    public String toString() {
        return String.format("id: %d, Last name: %s, First name: %s, Patronymic: %s, Address: %s, " +
                        "Credit card number: %s, Bank account number: %s",
                id, lastName, firstName, patronymic, address,
                cardNumber, bankAccountNumber);
    }

}
