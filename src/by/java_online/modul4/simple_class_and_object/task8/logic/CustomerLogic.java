package by.java_online.modul4.simple_class_and_object.task8.logic;

import by.java_online.modul4.simple_class_and_object.task8.entity.Customer;
import by.java_online.modul4.simple_class_and_object.task8.entity.CustomerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerLogic {

    public static List <Customer> sortName(CustomerBase base) {
        List<Customer> sortNameCustomer = new ArrayList<>();
        sortNameCustomer.addAll(base.getCustomerBase());
        Collections.sort(sortNameCustomer, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getLastName().compareToIgnoreCase(o2.getLastName());
            }
        });
        return sortNameCustomer;
    }

   public static List<Customer> rangeCreditCard(CustomerBase base, int min, int max) {
        List <Customer> list = new ArrayList<>();
        for (int i = 0; i < base.getCustomerBase().size(); i ++) {
            if (base.getCustomerBase().get(i).getCardNumber() > min
                    && base.getCustomerBase().get(i).getCardNumber() < max) {
                list.add(base.getCustomerBase().get(i));
            }
        }
        return list;
    }

}
