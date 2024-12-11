package java_1211.JAVAair;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Flight {
    private String destination;
    private String time;
    private int price;
    //금액표기 포멧 120000 -> 1,200,000원처럼 나오도록
    private DecimalFormat priceFormat = new DecimalFormat("#, ###원");
    //국제선은 15세미만 탑승금지
    private Boolean internationalFlight;
    //좌석
    private ArrayList<String> seats;

    public Flight(String destination, String time, int price, Boolean internationalFlight, ArrayList<String> seats) {
        this.destination = destination;
        this.time = time;
        this.price = price;
        this.internationalFlight = internationalFlight;
        this.seats = seats;
        seats = new ArrayList<>();
        for(int i = 1 ; i<20 ; i++){
            seats.add(i + "");//숫자를 문자열로 넣기
        }
    }

    @Override
    public String toString(){
        String priceComma = priceFormat.format(price);
        return " ." + "destination" + ", 출발시간" + time + ", 가격 : " + priceComma;
    }

}//END Flight
