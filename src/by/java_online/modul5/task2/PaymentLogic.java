package by.java_online.modul5.task2;

import java.util.List;

public class PaymentLogic {

    public double totalAmountPayment (List <Payment.Product> productList){
        double sum = 0.0;

        for (Payment.Product product : productList) {
            sum+= product.getPrice();
        }
        return sum;
    }
}
