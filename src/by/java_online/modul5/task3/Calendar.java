package by.java_online.modul5.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calendar {

    private int year;
    private List<Month> monthList;

    public Calendar() {
        this.year = 2021;
        this.monthList = new ArrayList<>();
    }

    public Calendar(int year) {
        this.year = year;
        this.monthList = new ArrayList<>();
    }

    public Calendar(int year, List<Month> monthList) {
        this.year = year;
        this.monthList = monthList;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Month> getMonthList() {
        return monthList;
    }

    public void setMonthList(List<Month> monthList) {
        this.monthList = monthList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calendar calendar = (Calendar) o;

        if (year != calendar.year) return false;
        return Objects.equals(monthList, calendar.monthList);
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (monthList != null ? monthList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "year=" + year +
                ", monthList=" + monthList +
                '}';
    }

    public static class Month {

        private String name;
        private List<Date> dateList;

        public Month() {
        }

        public Month(String name) {
            this.name = name;
            dateList = new ArrayList<>();
        }

        public Month(String name, List<Date> dateList) {
            this.name = name;
            this.dateList = dateList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Date> getDateList() {
            return dateList;
        }

        public void setDateList(List<Date> dateList) {
            this.dateList = dateList;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Month month = (Month) o;

            if (!Objects.equals(name, month.name)) return false;
            return Objects.equals(dateList, month.dateList);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (dateList != null ? dateList.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Month{" +
                    "name='" + name + '\'' +
                    ", dateList=" + dateList +
                    '}';
        }

        public static class Date {

            private int number;
            private DayOfWeek dayOfWeek;

            private boolean isWeekend;
            private boolean isHoliday;

            public Date() {
            }

            public Date(int number, DayOfWeek dayOfWeek) {
                this.number = number;
                this.dayOfWeek = dayOfWeek;
            }

            public Date(int number, DayOfWeek dayOfWeek, boolean isWeekend, boolean isHoliday) {
                this.number = number;
                this.dayOfWeek = dayOfWeek;
                this.isWeekend = isWeekend;
                this.isHoliday = isHoliday;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public DayOfWeek getDayOfWeek() {
                return dayOfWeek;
            }

            public void setDayOfWeek(DayOfWeek dayOfWeek) {
                this.dayOfWeek = dayOfWeek;
            }

            public boolean isWeekend() {
                return isWeekend;
            }

            public void setWeekend(boolean weekend) {
                isWeekend = weekend;
            }

            public boolean isHoliday() {
                return isHoliday;
            }

            public void setHoliday(boolean holiday) {
                isHoliday = holiday;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Date date = (Date) o;

                if (number != date.number) return false;
                if (isWeekend != date.isWeekend) return false;
                if (isHoliday != date.isHoliday) return false;
                return dayOfWeek == date.dayOfWeek;
            }

            @Override
            public int hashCode() {
                int result = number;
                result = 31 * result + (dayOfWeek != null ? dayOfWeek.hashCode() : 0);
                result = 31 * result + (isWeekend ? 1 : 0);
                result = 31 * result + (isHoliday ? 1 : 0);
                return result;
            }

            @Override
            public String toString() {
                return "Date{" +
                        "number=" + number +
                        ", dayOfWeek=" + dayOfWeek +
                        ", isWeekend=" + isWeekend +
                        ", isHoliday=" + isHoliday +
                        '}';
            }
        }
    }
}