package java_1205.Calendar;

import java.util.Calendar;

public class Calendar2 {
    public static void main(String[] args) {
        Calendar startDate = Calendar.getInstance();
        startDate.set(2025,Calendar.JANUARY,1);

        Calendar endDate = Calendar.getInstance();
        endDate.set(2025,Calendar.DECEMBER,31);

        long startMillis = startDate.getTimeInMillis(); //밀리세컨드 1/1000초
        long endMillis = endDate.getTimeInMillis();


    }
}
