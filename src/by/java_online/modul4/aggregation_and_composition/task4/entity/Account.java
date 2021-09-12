package by.java_online.modul4.aggregation_and_composition.task4.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable {
    @Serial
    private static final long serialVersionUID = -6962549869957687029L;

    private String name;
    private String accountNumber;
    private int balance = 0;
    private boolean Block = false;

    public Account() {
    }

    public Account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (!Block) {
            this.balance = balance;
        } else {
            System.out.println("Счет заблокирован, операция невозможна.");
        }
    }

    public boolean isBlock() {
        return this.Block;
    }

    public void setBlock(boolean isBlock) {
        this.Block = isBlock;
        if (!isBlock) {
            System.out.println("Счет разблокирован.");
        } else {
            System.out.println("Счет заблокирован.");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account that = (Account) o;
        if (balance != that.balance) return false;
        if (this.Block != that.Block) return false;
        return Objects.equals(accountNumber, that.accountNumber) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
        result = 31 * result + balance;
        result = 31 * result + (this.Block ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account { name = '" + name + '\'' + ", accountNumber = '" + accountNumber + '\'' +
                ", balance = " + balance + ", isBlock = " + Block + '}';
    }
}
