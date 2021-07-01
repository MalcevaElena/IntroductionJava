package by.java_online.modul4.aggregation_and_composition.task4.logic;

import by.java_online.modul4.aggregation_and_composition.task4.entity.Account;
import by.java_online.modul4.aggregation_and_composition.task4.entity.Bank;
import by.java_online.modul4.aggregation_and_composition.task4.entity.Customer;

public class AccountLogic {


    // блокировка/разблокировка счета
    public void blockAccount(Customer customer, String bankAccountNumber, Boolean bool) {
        for (int i = 0; i < customer.getAccounts().size(); i++) {
            if (customer.getAccounts().get(i).getAccountNumber().equals(bankAccountNumber)) {
                customer.getAccounts().get(i).setBlock(bool);
            }
        }
    }

    // поиск счета
    public Account search(Bank bank, String accountNumber) {

        for (int i = 0; i < bank.getClients().size(); i++) {
            Customer customer = bank.getClients().get(i);

            for (int j = 0; j < customer.getAccounts().size(); j++) {
                Account account = customer.getAccounts().get(j);

                if (account.getAccountNumber().equals(accountNumber)) {
                    return account;
                }
            }
        }
        return null;
    }

}

