package by.java_online.modul5.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Product> productList;

    public Payment() {
        this.productList = new ArrayList<>();
    }

    public Payment (List <Product> productList){
        this.productList = productList;
    }



    public static class Product {
        private String name;
        private double price;

        public Product() {
        }

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Product product = (Product) o;

            if (Double.compare(product.price, price) != 0) return false;
            return name != null ? name.equals(product.name) : product.name == null;
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = name != null ? name.hashCode() : 0;
            temp = Double.doubleToLongBits(price);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public String toString() {
            return "Product{ name='" + name + '\'' +
                    ", price=" + price + '}';
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        return productList != null ? productList.equals(payment.productList) : payment.productList == null;
    }

    @Override
    public int hashCode() {
        return productList != null ? productList.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Payment{ productList=" + productList +'}';
    }
}
