package by.java_online.modul5.task3;

public class CalendarLogic {

    public void isWeekend(Calendar calendar) {
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        DayOfWeek saturday = DayOfWeek.SATURDAY;
        for (Calendar.Month month : calendar.getMonthList()) {
            for (Calendar.Month.Date date : month.getDateList()) {
                if (date.getDayOfWeek().equals(saturday) || date.getDayOfWeek().equals(sunday)) {
                    date.setWeekend(true);
                }
            }
        }
    }

    public void isHoliday(Calendar calendar, int numberDate) {
        for (Calendar.Month month : calendar.getMonthList()) {
            for (Calendar.Month.Date date : month.getDateList()) {
                if (date.getNumber() == numberDate) {
                    date.setHoliday(true);
                }
            }
        }
    }
}
