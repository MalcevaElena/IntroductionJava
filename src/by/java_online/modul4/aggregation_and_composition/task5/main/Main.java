package by.java_online.modul4.aggregation_and_composition.task5.main;

import by.java_online.modul4.aggregation_and_composition.task5.view.Show;
import by.java_online.modul4.aggregation_and_composition.task5.logic.TravelCompanyLogic;
import by.java_online.modul4.aggregation_and_composition.task5.entity.*;

import java.util.GregorianCalendar;
import java.util.List;

/*
Туристические путевки.
Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шоппинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней.
Реализовать выбор и сортировку путевок
 */
public class Main {
    public static void main(String[] args) {
        TravelCompany anex = new TravelCompany("Anextour");
        TravelCompanyLogic logic = new TravelCompanyLogic();

        Voucher relaxation = new Voucher(TypeVoucher.RELAXATION, TypeTransport.TRAIN, TypeFood.FB, 9,
                new GregorianCalendar(2021, 07, 05), 12000);
        anex.add(relaxation);

        Voucher shopping = new Voucher(TypeVoucher.SHOPPING, TypeTransport.CAR, TypeFood.BB, 3,
                new GregorianCalendar(2021, 07, 05), 8000);
        anex.add(shopping);

        Voucher excursion = new Voucher(TypeVoucher.EXCURSION, TypeTransport.PLANE, TypeFood.BB, 7,
                new GregorianCalendar(2021, 07, 05), 15000);
        anex.add(excursion);

        Voucher relaxation2 = new Voucher(TypeVoucher.RELAXATION, TypeTransport.CAR, TypeFood.FB, 5,
                new GregorianCalendar(2021, 07, 13), 7000);
        anex.add(relaxation2);

        Voucher cruise = new Voucher(TypeVoucher.CRUISE, TypeTransport.LINER, TypeFood.HB, 3,
                new GregorianCalendar(2021, 07, 12), 18000);
        anex.add(cruise);

        Voucher excursion2 = new Voucher(TypeVoucher.EXCURSION, TypeTransport.BUS, TypeFood.NO, 5,
                new GregorianCalendar(2021, 07, 13), 9000);
        anex.add(excursion2);

        Voucher treatment = new Voucher(TypeVoucher.TREATMENT, TypeTransport.TRAIN, TypeFood.FB, 13,
                new GregorianCalendar(2021, 07, 14), 23000);
        anex.add(treatment);

        Voucher treatment2 = new Voucher(TypeVoucher.TREATMENT, TypeTransport.CAR, TypeFood.AL, 11,
                new GregorianCalendar(2021, 07, 9), 19000);
        anex.add(treatment2);

        Voucher shopping2 = new Voucher(TypeVoucher.SHOPPING, TypeTransport.LINER, TypeFood.FB, 5,
                new GregorianCalendar(2021, 07, 9), 13000);
        anex.add(shopping2);

        Voucher cruise2 = new Voucher(TypeVoucher.CRUISE, TypeTransport.LINER, TypeFood.AL, 5,
                new GregorianCalendar(2021, 07, 7), 23000);
        anex.add(cruise2);

        System.out.println("Отсортируем по типу путевки:");
        Show.printVoucher(logic.sortTypeVoucher(anex.getVoucherList()));

        System.out.println("Отсортируем по типу питания:");
        Show.printVoucher(logic.sortTypeFood(anex.getVoucherList()));

        System.out.println("Отсортируем по типу транспорта:");
        Show.printVoucher(logic.sortTypeTransport(anex.getVoucherList()));

        System.out.println("Отсортируем по количеству дней:");
        Show.printVoucher(logic.sortNumberDay(anex.getVoucherList()));

        System.out.println("Отсортируем по цене:");
        Show.printVoucher(logic.sortPrice(anex.getVoucherList()));

        System.out.println("Подберем тур по типу отдыха: ");
        List <Voucher> find =logic.findByTypeVoucher(TypeVoucher.CRUISE, anex.getVoucherList());
        Show.printVoucher(find);

        System.out.println("Подберем тур по типу отдыха и количеству дней: ");
        List <Voucher> find2 = logic.findByTypeVoucher(TypeVoucher.CRUISE, anex.getVoucherList());
        find2 = logic.findByNumberDay(5,find2);
        Show.printVoucher(find2);

        System.out.println("Подберем тур: дешевле 20т, тип - экскурсия, транспорт - автобус: ");
        List <Voucher> find3 = logic.findByTypeVoucher(TypeVoucher.EXCURSION, anex.getVoucherList());
        find3 = logic.findByPrice(20000,find3);
        find3 = logic.findByTypeTransport(TypeTransport.BUS, find3);
        Show.printVoucher(find3);
    }
}
