package by.java_online.modul4.aggregation_and_composition.task5.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TravelCompany implements Serializable {
    @Serial
    private static final long serialVersionUID = -7037886508145491158L;

    private String name;
    private List<Voucher> voucherList;

    public TravelCompany() {
        this.voucherList = new ArrayList<Voucher>();
    }

    public TravelCompany(String name) {
        this();
        this.name = name;
    }

    public TravelCompany(String name, List<Voucher> voucherList) {
        this.name = name;
        this.voucherList = voucherList;
    }

    public void add(Voucher voucher) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelCompany travelCompany = (TravelCompany) o;
        if (!Objects.equals(name, travelCompany.name)) return false;
        return Objects.equals(voucherList, travelCompany.voucherList);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (voucherList != null ? voucherList.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "TravelCompany{" +
                "name='" + name + '\'' +
                ", voucherList=" + voucherList +
                '}';
    }
}
