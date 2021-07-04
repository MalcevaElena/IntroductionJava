package by.java_online.modul4.aggregation_and_composition.task5.logic;

import by.java_online.modul4.aggregation_and_composition.task5.entity.TypeFood;
import by.java_online.modul4.aggregation_and_composition.task5.entity.TypeTransport;
import by.java_online.modul4.aggregation_and_composition.task5.entity.TypeVoucher;
import by.java_online.modul4.aggregation_and_composition.task5.entity.Voucher;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TravelCompanyLogic {

    public List<Voucher> sortTypeVoucher(List<Voucher> vouchers) {
        List<Voucher> sortTypeVoucher = new ArrayList<>();
        sortTypeVoucher.addAll(vouchers);
        Voucher tpm;
        for (int i = 1; i < sortTypeVoucher.size() - 1; i++) {
            for (int j = i + 1; j < sortTypeVoucher.size(); j++) {
                if (sortTypeVoucher.get(i - 1).getTypeVoucher().equals(sortTypeVoucher.get(j).getTypeVoucher())) {
                    tpm = sortTypeVoucher.get(j);
                    sortTypeVoucher.set(j, sortTypeVoucher.get(i));
                    sortTypeVoucher.set(i, tpm);
                }
            }
        }
        return sortTypeVoucher;
    }

    public List<Voucher> sortTypeFood(List<Voucher> vouchers) {
        List<Voucher> sortTypeFood = new ArrayList<>();
        sortTypeFood.addAll(vouchers);
        Voucher tpm;
        for (int i = 1; i < sortTypeFood.size() - 1; i++) {
            for (int j = sortTypeFood.size() - 1; j > i; j--) {
                if (sortTypeFood.get(i - 1).getTypeFood().equals(sortTypeFood.get(j).getTypeFood())) {
                    tpm = sortTypeFood.get(j);
                    sortTypeFood.set(j, sortTypeFood.get(i));
                    sortTypeFood.set(i, tpm);
                }
            }
        }
        return sortTypeFood;
    }

    public List<Voucher> sortTypeTransport(List<Voucher> vouchers) {
        List<Voucher> sortTypeTransport = new ArrayList<>();
        sortTypeTransport.addAll(vouchers);
        Voucher tpm;
        for (int i = 1; i < sortTypeTransport.size() - 1; i++) {
            for (int j = sortTypeTransport.size() - 1; j > 1; j--) {
                if (sortTypeTransport.get(i - 1).getTypeTransport().equals(sortTypeTransport.get(j).getTypeTransport())) {
                    tpm = sortTypeTransport.get(j);
                    sortTypeTransport.set(j, sortTypeTransport.get(i));
                    sortTypeTransport.set(i, tpm);
                }
            }
        }
        return sortTypeTransport;
    }

    public List<Voucher> sortNumberDay(List<Voucher> vouchers) {
        List<Voucher> sortNumberDay = new ArrayList<>();
        sortNumberDay.addAll(vouchers);
        Voucher tpm;
        for (int i = 0; i < sortNumberDay.size() - 1; i++) {
            for (int j = i + 1; j < sortNumberDay.size(); j++) {
                if (sortNumberDay.get(i).getDays() > sortNumberDay.get(j).getDays()) {
                    tpm = sortNumberDay.get(j);
                    sortNumberDay.set(j, sortNumberDay.get(i));
                    sortNumberDay.set(i, tpm);
                }
            }
        }
        return sortNumberDay;
    }

    public List<Voucher> sortPrice(List<Voucher> vouchers) {
        List<Voucher> sortPrice = new ArrayList<>();
        sortPrice.addAll(vouchers);
        Voucher tpm;
        for (int i = 0; i < sortPrice.size() - 1; i++) {
            for (int j = i + 1; j < sortPrice.size(); j++) {
                if (sortPrice.get(i).getPrice() > sortPrice.get(j).getPrice()) {
                    tpm = sortPrice.get(j);
                    sortPrice.set(j, sortPrice.get(i));
                    sortPrice.set(i, tpm);
                }
            }
        }
        return sortPrice;
    }


    public List<Voucher> findByTypeVoucher(TypeVoucher typeVoucher, List<Voucher> voucherList) {
        if (typeVoucher == null) {
            return voucherList;
        }
        List<Voucher> listTypeVoucher = new ArrayList<>();
        for (int i = 0; i < voucherList.size(); i++) {
            if (voucherList.get(i).getTypeVoucher().equals(typeVoucher)) {
                listTypeVoucher.add(voucherList.get(i));
            }
        }
        return listTypeVoucher;
    }

    public List<Voucher> findByTypeFood(TypeFood typeFood, List<Voucher> voucherList) {
        if (typeFood == null) {
            return voucherList;
        }
        List<Voucher> listTypeFood = new ArrayList<>();
        for (int i = 0; i < voucherList.size(); i++) {
            if (voucherList.get(i).getTypeFood().equals(typeFood)) {
                listTypeFood.add(voucherList.get(i));
            }
        }
        return listTypeFood;
    }

    public List<Voucher> findByTypeTransport(TypeTransport typeTransport, List<Voucher> voucherList) {
        if (typeTransport == null) {
            return voucherList;
        }
        List<Voucher> listTypeTransport = new ArrayList<>();
        for (int i = 0; i < voucherList.size(); i++) {
            if (voucherList.get(i).getTypeTransport().equals(typeTransport)) {
                listTypeTransport.add(voucherList.get(i));
            }
        }
        return listTypeTransport;
    }

    public List<Voucher> findByNumberDay(int day, List<Voucher> voucherList) {
        if (day == 0) {
            return voucherList;
        }
        List<Voucher> listNumberDay = new ArrayList<>();
        for (int i = 0; i < voucherList.size(); i++) {
            if (voucherList.get(i).getDays() == day) {
                listNumberDay.add(voucherList.get(i));
            }
        }
        return listNumberDay;
    }


    public List<Voucher> findByDate(Calendar checkIn, List<Voucher> voucherList) {
        if (checkIn == null) {
            return voucherList;
        }
        List<Voucher> listCalendar = new ArrayList<>();
        for (int i = 0; i < voucherList.size(); i++) {
            if (voucherList.get(i).getCheckIn().equals(checkIn)) {
                listCalendar.add(voucherList.get(i));
            }
        }
        return listCalendar;
    }

    public List<Voucher> findByPrice(int price, List<Voucher> voucherList) {
        if (price == 0) {
            return voucherList;
        }
        List<Voucher> listPrice = new ArrayList<>();
        for (int i = 0; i < voucherList.size(); i++) {
            if (voucherList.get(i).getPrice()<=price) {
                listPrice.add(voucherList.get(i));
            }
        }
        return listPrice;
    }

}
