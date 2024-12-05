package java_1205.Calendar;

import java.util.Calendar;

public class Calendar1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        //날짜 및 시간 출력
        System.out.println("현재 시간 : " + year + " - " + month + " - " + hour + " : " + minute + " : " + second);


    }
}
