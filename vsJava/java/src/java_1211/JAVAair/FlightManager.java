package java_1211.JAVAair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlightManager {
    //항공편 정보 저장
    private static ArrayList<Flight> flights;
    //예약된 승객 정보
    private static ArrayList<Passenger> passengers;
    //승객을 기록하고 예약 된 항공편을 값으로 가지는 Map
    private static Map<String, Flight> reservationMap = new HashMap<>();

    private static FileC fc = new FileC();//파일관련작업

    Scanner sc = new Scanner(System.in);
    public String airplane = "                       |                      \n" + "                      _|_                     \n" + "                    /_____\\                  \n" + "                   /oo   oo\\                 \n" + " \\_________________\\       /_________________/\n" + "  `-------|---|-----\\_____/-----|---|-------'\n" + "         ( ) ( )  O|OOo|oOO|O  ( ) ( )   \n";

    public FlightManager(){
        flights = new ArrayList<>();
        flights.add(new Flight("제주","11:55", 78000, false));
        flights.add(new Flight("이스탄불","17:10",1200000,true));
        flights.add(new Flight("방콕","21:35",280000,true));

        passengers = new ArrayList<>();
        flights = new ArrayList<>();
        Flight sf = flights.get(0);
        reservationMap.put("테스트", sf);
    }

    //항공편 목록 처리
    public void displayFlightList(String str) {
        System.out.println("================== " + str + " ==================");
        int count =1;
        for(Flight flight : flights){
            System.out.println(count+ "" +flight);
            count++;
        }
        System.out.println("===============================================");
    }

    //예매처리
    public void bookFlight() throws InterruptedException{
        //국제선 - 사용자 이름, 생년월일 받아서 나이 확인하고 만 15세 미만은 예약 거절
        for(;;) { //무한루프
            displayFlightList("항공편 예매");
            System.out.println("예매할 항공편 입력 > ");
            try{
                //입력받은 번호는 flight.get(Booknum-1);
                int bookNum = Integer.parseInt(sc.next());
                if(bookNum > flights.size() || bookNum < 1){
                    //예약할 수 있는 목록의 갯수보다 크거나 목록이 없으면
                    System.out.println("잘못된 입력입니다");
                    continue;
                    //유효하지 않은 입력을 받은 경우 루프 다음을 반복
                    //사용자에게 올바른 입력 다시 요청
                }
                System.out.println("선택한 항공편");
                System.out.println("==================================");
                System.out.println(bookNum + "" + flights.get(bookNum -1));
                System.out.println("==================================");
                Flight sf = flights.get(bookNum -1); //선택한 항공편 sf로 저장
                if(flights.get(bookNum -1).getInternationalFlight()){//국제선을 선택하면
                    //국제선을 선택했을 때
                    System.out.println("국제선은 만 15세 이상 예매 가능");
                    passengerInfo(sf);
                }else{
                    passengerInfo(sf);
                }
                
            }catch(NumberFormatException e){
                System.out.println("잘못된 입력입니다");
            }
        }
    }

}
