package java_1205.Calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("기본 ISO 형식 : " + now);

        //커스텀 포맷
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate =now.format(formatter);
        System.out.println("포맷팅 된 날짜 : " + formattedDate);

    }
}
