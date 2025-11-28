package pr7;

import java.util.Date;

public class ExtraTask1 {
    public static void main(String[] args) {
        long[] times = {
                10_000L,
                100_000L,
                1_000_000L,
                10_000_000L,
                100_000_000L,
                1_000_000_000L,
                10_000_000_000L,
                100_000_000_000L
        };

        for (long t : times) {
            Date date = new Date();
            date.setTime(t);
            System.out.println("Время: " + t + " → " + date.toString());
        }
    }
}
