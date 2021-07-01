package by.java_online.modul4.aggregation_and_composition.task4.logic;

import by.java_online.modul4.aggregation_and_composition.task4.entity.Account;
import by.java_online.modul4.aggregation_and_composition.task4.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

    public List<Account> sortByBalance(Customer customer) {

        List<Account> accounts = new ArrayList<>();
        accounts.addAll(customer.getAccounts());

        Account tmp;

        for (int i = 0; i < accounts.size() - 1; i++) {
            for (int j = i + 1; j < accounts.size(); j++) {
                if (accounts.get(j).getBalance() < accounts.get(i).getBalance()) {
                    tmp = accounts.get(i);
                    accounts.set(i, accounts.get(j));
                    accounts.set(j, tmp);

                }
            }
        }
        return accounts;
    }

    //остаток по всем счетам
    public int totalBalance(Customer customer) {
        int result = 0;
        for (int i = 0; i < customer.getAccounts().size(); i++) {
            result += customer.getAccounts().get(i).getBalance();
        }
        return result;
    }

    //остаток по положительным счетам
    public int positiveBalance(Customer customer) {
        int result = 0;
        for (int i = 0; i < customer.getAccounts().size(); i++) {
            if (customer.getAccounts().get(i).getBalance() > 0) {
                result += customer.getAccounts().get(i).getBalance();
            }
        }
        return result;
    }

    //остаток по отрицательным счетам (задолженность по кредитным картам)
    public int negativeBalance(Customer customer) {
        int result = 0;
        for (int i = 0; i < customer.getAccounts().size(); i++) {
            if (customer.getAccounts().get(i).getBalance() < 0)
                result += customer.getAccounts().get(i).getBalance();
        }
        return result;
    }
}
