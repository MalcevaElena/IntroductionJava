package by.java_online.modul4.aggregation_and_composition.task5.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Voucher implements Serializable {
    private TypeVoucher typeVoucher;
    private TypeTransport typeTransport;
    private TypeFood typeFood;
    private int days = 3;// минимальное кол-во дней
    private Calendar checkIn = new GregorianCalendar();
    private Calendar checkOut;
    private int price;

    public Voucher() {
    }

    public Voucher(TypeVoucher typeVoucher, TypeTransport typeTransport, TypeFood typeFood) {
        this.typeVoucher = typeVoucher;
        this.typeTransport = typeTransport;
        this.typeFood = typeFood;
        this.checkOut = (Calendar) (checkIn.clone());
        this.checkOut.add(Calendar.DAY_OF_MONTH, days);
    }

    public Voucher(TypeVoucher typeVoucher, TypeTransport typeTransport, TypeFood typeFood, int days) {
        this.typeVoucher = typeVoucher;
        this.typeTransport = typeTransport;
        this.typeFood = typeFood;
        this.days = days;
        this.checkOut = (Calendar) (checkIn.clone());
        this.checkOut.add(Calendar.DAY_OF_MONTH, days);

    }

    public Voucher(TypeVoucher typeVoucher, TypeTransport typeTransport, TypeFood typeFood, int days, Calendar checkIn, int price) {
        this.typeVoucher = typeVoucher;
        this.typeTransport = typeTransport;
        this.typeFood = typeFood;
        this.days = days;
        this.checkIn = checkIn;
        this.checkOut = (Calendar) (checkIn.clone());
        this.checkOut.add(Calendar.DAY_OF_MONTH, days);
        this.price = price;

    }

    public TypeVoucher getTypeVoucher() {
        return typeVoucher;
    }

    public void setTypeVoucher(TypeVoucher typeVoucher) {
        this.typeVoucher = typeVoucher;
    }

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(TypeTransport typeTransport) {
        this.typeTransport = typeTransport;
    }

    public TypeFood getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(TypeFood typeFood) {
        this.typeFood = typeFood;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        if (days > 0) {
            this.days = days;
        } else {
            System.out.println("Количество дней должно быть больше 0.");
        }
    }

    public Calendar getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Calendar checkIn) {
        this.checkIn = checkIn;
    }

    public Calendar getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Calendar checkOut) {
        this.checkOut = checkOut;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Цена должна быть больше 0.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voucher voucher = (Voucher) o;

        if (days != voucher.days) return false;
        if (price != voucher.price) return false;
        if (typeVoucher != voucher.typeVoucher) return false;
        if (typeTransport != voucher.typeTransport) return false;
        if (typeFood != voucher.typeFood) return false;
        if (!Objects.equals(checkIn, voucher.checkIn)) return false;
        return Objects.equals(checkOut, voucher.checkOut);
    }

    @Override
    public int hashCode() {
        int result = typeVoucher != null ? typeVoucher.hashCode() : 0;
        result = 31 * result + (typeTransport != null ? typeTransport.hashCode() : 0);
        result = 31 * result + (typeFood != null ? typeFood.hashCode() : 0);
        result = 31 * result + days;
        result = 31 * result + (checkIn != null ? checkIn.hashCode() : 0);
        result = 31 * result + (checkOut != null ? checkOut.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "typeVoucher=" + typeVoucher +
                ", typeTransport=" + typeTransport +
                ", typeFood=" + typeFood +
                ", days=" + days +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", price=" + price +
                '}';
    }
}
