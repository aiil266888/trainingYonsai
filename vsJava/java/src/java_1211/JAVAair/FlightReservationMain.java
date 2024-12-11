package java_1211.JAVAair;

import java.util.Scanner;

public class FlightReservationMain {
    public static void main(String[] args) {
        //FlightManager객체 생성과 동시에 더미데이터 삽입
        //예약할수있는 항공편 데이터 들어옴
        FlightManager fm = new FlightManager();

        Scanner sc = new Scanner(System.in);
        FileC fc = new FileC();
        System.out.println(fm.airplane);
        System.out.println("============JavaAir에 오신걸 환영합니다===============");

        Outter:while(true){
            System.out.println("1. 항공편 목록\n2. 항공편 예매\n3. 예약 조회\n4. 티켓 저장\n5. 항공편 업로드 \n0.종료\n");
            System.out.print("메뉴입력>");

            String menuStr = sc.next();
            sc.nextLine(); //버퍼 비우기

            int menu = -1;

            try{
                menu = Integer.parseInt(menuStr);
            }catch(NumberFormatException e){
                menu = 9;
            }
            switch(menu){
                case 1 : //학공편 목록
                    fm.displayFlightList("항공편 목록");
                    break;
                case 2:
                    try{
                        fm.bookFlight();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    sc.close();
                    break Outter; //Outer(지정한 위치)로 빠져나감
                default:
                    System.out.println("잘못된 입력 입니다");
                    break;
            }
        }//END while

    }

}

