package by.java_online.modul5.task3;

/* Создать класс Календарь с внутренним классом,
 * с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 */

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(2021);
        Calendar.Month january = new Calendar.Month("January");
        calendar.getMonthList().add(january);


        for (int i = 0; i < 31; i++) {
            Calendar.Month.Date date = new Calendar.Month.Date(i + 1, DayOfWeek.values()[i % 7]);
            january.getDateList().add(date);
        }

        CalendarLogic logic = new CalendarLogic();
        logic.isWeekend(calendar);

        for (int i = 1; i < 10; i++) {
            logic.isHoliday(calendar, i);
        }

        View.printCalendar(calendar);
        System.out.println(calendar);

    }
}
