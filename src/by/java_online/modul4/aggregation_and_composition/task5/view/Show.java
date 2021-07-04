package by.java_online.modul4.aggregation_and_composition.task5.view;

import by.java_online.modul4.aggregation_and_composition.task5.entity.Voucher;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class Show {


    public static void printVoucher(List<Voucher> vouchers) {
        for (Voucher voucher : vouchers) {
            DateFormat df = new SimpleDateFormat("dd MMMM yyyy");

            System.out.printf("Тип отдыха: %11s, Тип питания: %3s, Тип транспорта: %6s, Количество дней: %3d, с %s по %s, Цена: %6d \n",
                    voucher.getTypeVoucher(),voucher.getTypeFood(),voucher.getTypeTransport(),voucher.getDays(),df.format(voucher.getCheckIn().getTime()),
                    df.format(voucher.getCheckOut().getTime()),voucher.getPrice());
        }
    }
}
