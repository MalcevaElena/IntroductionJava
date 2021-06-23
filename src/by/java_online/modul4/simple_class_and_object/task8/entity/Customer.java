package by.java_online.modul4.simple_class_and_object.task8.entity;

public class Customer {
    private static int startID = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private int cardNumber;
    private long bankAccountNumber;

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

    @Override
    public String toString() {
        return String.format("id: %d, Last name: %s, First name: %s, Patronymic: %s, Address: %s, " +
                        "Credit card number: %s, Bank account number: %s",
                id, lastName, firstName, patronymic, address,
                cardNumber, bankAccountNumber);
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
}
