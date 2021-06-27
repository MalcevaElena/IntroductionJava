package by.java_online.modul4.aggregation_and_composition.task3.main;

/* Создать объект класса Государство, используя классы:
 * Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import by.java_online.modul4.aggregation_and_composition.task3.entity.City;
import by.java_online.modul4.aggregation_and_composition.task3.entity.District;
import by.java_online.modul4.aggregation_and_composition.task3.entity.Region;
import by.java_online.modul4.aggregation_and_composition.task3.entity.State;
import by.java_online.modul4.aggregation_and_composition.task3.view.Show;

public class Main {
    public static void main(String[] args) {
        City novokuzneck = new City("Новокузнецк", 424.3);
        City kemerovo = new City("Кемерово", 294.8);
        City belovo = new City("Белово", 219.3);
        City myski = new City("Мыски", 108.7);

        District kemerovskii = new District("Кемеровский район");
        kemerovskii.add(kemerovo);
        kemerovskii.add(belovo);

        District novokuzneckii = new District("Новокузнецкий район");
        novokuzneckii.add(novokuzneck);
        novokuzneckii.add(myski);

        Region kemerovskayaOblast = new Region("Кемеровская область", kemerovo);
        kemerovskayaOblast.add(kemerovskii);
        kemerovskayaOblast.add(novokuzneckii);

        State russia = new State("Россия", "Москва");
        russia.add(kemerovskayaOblast);

        Show show = new Show();

        //вывести на консоль столицу
        show.printCapital(russia);

        // количество областей
        show.printNumberRegion(russia);

        // площадь
        show.printArea(russia);
        show.printArea(kemerovskayaOblast);
        show.printArea(kemerovskii);
        show.printArea(novokuzneckii);
        show.printArea(novokuzneck);

        // областные центры
        show.printRegionalCenter(kemerovskayaOblast);

    }
}
