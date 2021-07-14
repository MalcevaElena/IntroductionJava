package by.java_online.modul5.task2;

import java.util.List;

public class View {

    public static void printPayment(List<Payment.Product> productList) {
        System.out.println("Список покупок: ");
        for (Payment.Product product : productList) {
            System.out.println("Название продукта: " + product.getName() + ", цена: " + product.getPrice());
        }
    }
}
