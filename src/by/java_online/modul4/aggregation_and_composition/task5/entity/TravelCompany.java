package by.java_online.modul4.aggregation_and_composition.task5.entity;

import java.util.ArrayList;
import java.util.List;

public class TravelCompany {
    private String name;
    private List <Voucher> voucherList;

    public TravelCompany() {
        this.name = "Гулливер";
        this.voucherList = new ArrayList<>();
    }

    public TravelCompany(String name) {
        this.name = name;
        this.voucherList = new ArrayList<>();
    }

    public TravelCompany(String name, List<Voucher> voucherList) {
        this.name = name;
        this.voucherList = voucherList;
    }

    public void add (Voucher voucher){
        voucherList.add(voucher);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Voucher> getVoucherList() {
        return voucherList;
    }

    public void setVoucherList(List<Voucher> voucherList) {
        this.voucherList = voucherList;
    }
}
