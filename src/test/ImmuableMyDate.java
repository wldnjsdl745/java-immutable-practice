package test;

public class ImmuableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmuableMyDate withImmuableMyDate(int newYear, int newMonth, int newDay){
        return new ImmuableMyDate(newYear, newMonth, newDay);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
