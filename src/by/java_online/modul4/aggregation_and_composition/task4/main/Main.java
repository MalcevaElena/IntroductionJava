package by.java_online.modul4.aggregation_and_composition.task4.main;

import by.java_online.modul4.aggregation_and_composition.task4.view.Show;
import by.java_online.modul4.aggregation_and_composition.task4.entity.Account;
import by.java_online.modul4.aggregation_and_composition.task4.entity.Bank;
import by.java_online.modul4.aggregation_and_composition.task4.entity.Customer;
import by.java_online.modul4.aggregation_and_composition.task4.logic.AccountLogic;
import by.java_online.modul4.aggregation_and_composition.task4.logic.CustomerLogic;

import java.util.List;

/* Счета. Клиент может иметь несколько счетов в банке.
 * Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов.
 * Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Main {
    public static void main(String[] args) {
        AccountLogic accountLogic = new AccountLogic();
        CustomerLogic customerLogic = new CustomerLogic();

        Bank KBB = new Bank("Кузнецкбизнесбанк");

        Customer customer = new Customer("Иванов ИИ", 23);

        KBB.add(customer);

        Account creditCard = new Account("Халва", "408178105");
        creditCard.setBalance(-1000);
        Account creditGoldCard = new Account("Золотая кредитная карта", "408178101");
        creditCard.setBalance(-5000);
        Account debitCard = new Account("Зарплатная карта", "408178102");
        debitCard.setBalance(50000);
        Account debitCard2 = new Account("Социальная карта", "408178103");
        debitCard2.setBalance(2000);

        customer.add(creditCard);
        customer.add(creditGoldCard);
        customer.add(debitCard);
        customer.add(debitCard2);

        String account = "408178103";
        System.out.println("Блокируем номер счета: " + account);

        //Пробуем изменить остаток у заблокированного счета
        accountLogic.blockAccount(customer, account, true);
        accountLogic.search(KBB, account).setBalance(1234);
        System.out.println();

        System.out.println("Разблокируем номер счета:" + account);
        accountLogic.blockAccount(customer, account, false);
        accountLogic.search(KBB, account).setBalance(1234);

        //Сортировка по балансу карт
        List<Account> sortAccount = customerLogic.sortByBalance(customer);
        Show.printAccount(customer, sortAccount);

        int totalBalance = customerLogic.totalBalance(customer);
        System.out.println("Общий баланс по всем картам равен = " + totalBalance);
        int positiveBalance = customerLogic.positiveBalance(customer);
        System.out.println("Положительный баланс по картам равен = " + positiveBalance);
        int negativeBalance = customerLogic.negativeBalance(customer);
        System.out.println("Задолженность (отрицательный баланс) по картам равен = " + negativeBalance);
    }
}
