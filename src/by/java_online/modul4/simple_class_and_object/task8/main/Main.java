package by.java_online.modul4.simple_class_and_object.task8.main;

import by.java_online.modul4.simple_class_and_object.task8.entity.Customer;
import by.java_online.modul4.simple_class_and_object.task8.entity.CustomerBase;
import by.java_online.modul4.simple_class_and_object.task8.logic.CustomerLogic;
import by.java_online.modul4.simple_class_and_object.task8.show.CustomerBaseShow;

import java.util.ArrayList;
import java.util.List;

/* Создать класс Customer, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Main {
    public static void main(String[] args) {
        CustomerBase vipCustomer = new CustomerBase("VIP customers", new ArrayList<>());

        vipCustomer.addCustomerBase("Иванов", "Иван", "Иванович",
                "Москва, ул. Пушкина, д.7", 4276_2345,
                408178105);
        vipCustomer.addCustomerBase("Петров", "Константин", "Федорович",
                "Новокузнецк, ул. Курако, д.83", 4222_0987,
                957304518);
        vipCustomer.addCustomerBase("Арбузов", "Сергей", "Петрович",
                "Ижевск, ул. Кирова, д.15", 1234_0987,
                810526046);


        System.out.println("sort by name:");
        List <Customer> listSortByName = CustomerLogic.sortName(vipCustomer);
        System.out.println("Группа клиентов: " + vipCustomer.getNameGroup());
        CustomerBaseShow.printCustomerBase(listSortByName);

        System.out.println();
        List<Customer> listSortByRangeCreditCard =
                CustomerLogic.rangeCreditCard(vipCustomer, 4200_0000, 5000_0000);
        System.out.println("Группа клиентов: " + vipCustomer.getNameGroup()+ " с диапазоном кредитных карт от 4200 до 5000");
        CustomerBaseShow.printCustomerBase(listSortByRangeCreditCard);
    }
}