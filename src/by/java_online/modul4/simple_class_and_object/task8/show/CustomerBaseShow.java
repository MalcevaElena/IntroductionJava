package by.java_online.modul4.simple_class_and_object.task8.show;

import by.java_online.modul4.simple_class_and_object.task8.entity.Customer;

import java.util.List;

public class CustomerBaseShow {

    public static void printCustomerBase (List <Customer> list){
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }
}
