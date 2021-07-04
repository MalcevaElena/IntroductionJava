package by.java_online.modul4.aggregation_and_composition.task5.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Voucher {
    private TypeVoucher typeVoucher;
    private TypeTransport typeTransport;
    private TypeFood typeFood;
    private int days;
    private Calendar checkIn;
    private Calendar checkOut;
    private int price;

    public Voucher(TypeVoucher typeVoucher, TypeTransport typeTransport, TypeFood typeFood) {
        this.typeVoucher = typeVoucher;
        this.typeTransport = typeTransport;
        this.typeFood = typeFood;
        this.days = 3; //мин кол-во дней
        this.checkIn = new GregorianCalendar();
        this.checkOut = (Calendar) (checkIn.clone());
        this.checkOut.add(Calendar.DAY_OF_MONTH,days);
    }

    public Voucher(TypeVoucher typeVoucher, TypeTransport typeTransport, TypeFood typeFood, int days) {
        this.typeVoucher = typeVoucher;
        this.typeTransport = typeTransport;
        this.typeFood = typeFood;
        this.days = days;
        this.checkIn = new GregorianCalendar();
        this.checkOut = (Calendar) (checkIn.clone());
        this.checkOut.add(Calendar.DAY_OF_MONTH,days);

    }

    public Voucher(TypeVoucher typeVoucher, TypeTransport typeTransport, TypeFood typeFood, int days, Calendar checkIn, int price) {
        this.typeVoucher = typeVoucher;
        this.typeTransport = typeTransport;
        this.typeFood = typeFood;
        this.days = days;
        this.checkIn = checkIn;
        this.checkOut = (Calendar) (checkIn.clone());
        this.checkOut.add(Calendar.DAY_OF_MONTH,days);
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
}
