package by.java_online.modul5.task2;
/* Создать класс Payment с внутренним классом, с помощью объектов
 * которого можно сформировать покупку из нескольких товаров.
 */

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        PaymentLogic logic = new PaymentLogic();

        payment.add("watermelon", 250.50);
        payment.add("melon", 360);
        payment.add("cucumber",80);
        payment.add("tomato", 255);

        double totalAmount = logic.totalAmountPayment(payment.getProductList());

        View.printPayment(payment.getProductList());
        System.out.println("Общая сумма покупки: " + totalAmount);

    }
}
