package SemiProject;


import java_1206.movie.Reservation;
import java_1211.javaair.FlightManager;

import java.awt.*;
import java.util.Scanner;

public class Main extends AbstractMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Id;
        String Pw;

        System.out.println("프로그램을 실행합니다");

        Outter:while(true){
            System.out.println("========L O G I N ========");
            System.out.print(" ID >>  ");
            Id = scan.nextLine();
            System.out.println();
            System.out.print("PASSWORD >> ");
            Pw = scan.nextLine();
            System.out.println();

            //관리자 체크
            if(Id == "admin"){

                //관리자 체크하고 로그인 체크하고 아래 IF문으로 분류해야함
            }//End if Admin Check


            //---------------------------일반유저용------------------------------------
            AbstractMenu am = new AbstractMenu();

            System.out.println("===============================================");
            System.out.println("1. 사원목록 조회 \n 2. 정보변경 \n3. 프로그램 종료");
            System.out.print("메뉴선택 >> ");
            int menu = scan.nextInt();
            switch(menu){
                case 1: // 사원목록 조회:
                    am.surchingList();
                    break;
                case 2: // 개인정보 변경
                    am.modifyInformation();
                    break;
                case 3: //프로그램 종료
                    System.out.println("프로그램을 종료합니다");
                    break;
            }

            //---------------------------관리자용------------------------------------
            AdminMenu  dm = new AdminMenu();
            System.out.println("================관리자 전용 화면입니다=================");
            System.out.println("1. 신규사원 등록 \n 2. 사원목록 조회 \n3. 사원정보 변경\n 4.사원 삭제 \n5. 프로그램 종료");
            System.out.print("메뉴선택 >> ");
            int amenu = scan.nextInt();
            switch(amenu){
                case 1: // 신규사원 등록:
                    dm.insertEmployee();
                    break;
                case 2: // 사원목록 조회
                    dm.serchEmployee();
                    break;
                case 3: // 사원정보 변경
                    dm.modifyEmployee();
                    break;
                case 4: // 사원삭제
                    dm.deleteEmployee();
                    break;
                case 5: //프로그램 종료
                    System.out.println("프로그램을 종료합니다");
                    break;
            }
        }//END While
    }//END MAIN
}//END class
