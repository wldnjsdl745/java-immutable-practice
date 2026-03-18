package test;

public class ImmuableMyDateMain {

    public static void main(String[] args) {
        ImmuableMyDate date1 = new ImmuableMyDate(2025,1,1);
        ImmuableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2026 -> date1");
//         date2 = new ImmuableMyDate(2026,1,1);
        date2 = date1.withImmuableMyDate(2026,1,1);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
