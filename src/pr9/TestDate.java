package pr9;

public class TestDate {
    public static void main(String[] args) {
        java.util.Date[] dates = new java.util.Date[10];

        System.out.println(dates[0]);

        if (dates[0] != null)
            System.out.println(dates[0].toString());
        else
            System.out.println("Element is null!");
    }
}
