package by.java_online.modul4.aggregation_and_composition.task4.view;

import by.java_online.modul4.aggregation_and_composition.task4.entity.Account;
import by.java_online.modul4.aggregation_and_composition.task4.entity.Customer;

import java.util.List;

public class Show {

    public static void printAccount(Customer customer, List<Account> accounts) {
        System.out.println("Клиент: " + customer.getFullName());
        System.out.println("Счета клиента:");
        for (Account account : accounts) {
            System.out.println("Название карты: " + account.getName() + ", номер банковского счета: " +
                    account.getAccountNumber() + ", баланс: " + account.getBalance()+
                    ", блокировка карты: "+account.isBlock());
        }
    }
}
