package by.java_online.modul5.task3;

public class View {

    public static void printCalendar(Calendar calendar) {
        System.out.println("Календарь " + calendar.getYear() + " года");
        for (Calendar.Month month : calendar.getMonthList()) {
            System.out.println("Месяц: " + month.getName());

            for (Calendar.Month.Date date : month.getDateList()) {
                System.out.printf("День: %2d, День недели: %9s, Выходной: %5s, Праздник: %s", date.getNumber(),
                        date.getDayOfWeek(), date.isWeekend(), date.isHoliday());
                System.out.println();
            }
        }
    }
}
