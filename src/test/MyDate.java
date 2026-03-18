package test;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setMyDate(int newYear, int newMonth, int newDay) {
        this.year = newYear;
        this.month = newMonth;
        this.day = newDay;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
