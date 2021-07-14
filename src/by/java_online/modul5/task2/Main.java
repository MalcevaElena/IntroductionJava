package by.java_online.modul5.task2;
/* Создать класс Payment с внутренним классом, с помощью объектов
 * которого можно сформировать покупку из нескольких товаров.
 */

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        PaymentLogic logic = new PaymentLogic();

        Payment.Product watermelon = new Payment.Product("Арбуз", 250.50);
        Payment.Product melon = new Payment.Product("Дыня", 360);
        Payment.Product cucumber = new Payment.Product("Огурцы", 80);
        Payment.Product tomato = new Payment.Product("Помидоры", 255);

        payment.getProductList().add(watermelon);
        payment.getProductList().add(melon);
        payment.getProductList().add(cucumber);
        payment.getProductList().add(tomato);

        double totalAmount = logic.totalAmountPayment(payment.getProductList());

        View.printPayment(payment.getProductList());
        System.out.println("Общая сумма покупки: " + totalAmount);

    }
}
