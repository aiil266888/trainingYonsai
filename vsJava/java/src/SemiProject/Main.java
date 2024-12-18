package SemiProject;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends AbstractMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Id;
        String Pw;
        int Adminflag = 0;
        Logincheck check = new Logincheck(); //실행 동시에 더미데이터 삽입

        System.out.println("프로그램을 실행합니다");

        Outter:while(true){
            System.out.println("=============L O G I N =============");
            System.out.print(" ID >>  ");
            Id = scan.nextLine();
            System.out.print("PASSWORD >> ");
            Pw = scan.nextLine();

            //로그인체크
            Logincheck lg  = new Logincheck();//로그인체크 객체 생성
            lg.checkLogin(Id,Pw);

            //관리자 체크
            if(Id.equals("admin")){
                Adminflag = 1;
            }

            if(Adminflag == 1){
                //---------------------------관리자용------------------------------------
                AdminMenu  dm = new AdminMenu();
                System.out.println("================관리자 전용 화면입니다=================");
                System.out.println("1. 신규사원 등록\n2. 사원목록 조회\n3. 사원정보 변경\n4. 사원 삭제\n5. 프로그램 종료");
                System.out.print("메뉴선택 >> ");
                int amenu = scan.nextInt();
                switch(amenu){
                    case 1: // 신규사원 등록:
                        lg.insertEmployee();
                        break;
                    case 2: // 사원목록 조회
                        lg.serchEmployee();
                        break;
                    case 3: // 사원정보 변경
                        lg.modifyEmployee();
                        break;
                    case 4: // 사원삭제
                        lg.deleteEmployee();
                        break;
                    case 5: //프로그램 종료
                        System.out.println("프로그램을 종료합니다");
                        Adminflag = 0;
                        break Outter;
                }
            }else{
                //---------------------------일반유저용------------------------------------
                AbstractMenu am = new AbstractMenu();

                System.out.println("===============================================");
                System.out.println("1. 사원목록 조회\n 2. 정보변경\n3. 프로그램 종료");
                System.out.print("메뉴선택 >> ");
                int menu = scan.nextInt();
                switch(menu){
                    case 1: // 사원목록 조회:
                        lg.surchingList(Id);
                        break;
                    case 2: // 개인정보 변경
                        lg.modifyInformation(Id);
                        break;
                    case 3: //프로그램 종료
                        System.out.println("프로그램을 종료합니다");
                        break Outter;
                }
            }//END Admin MENU
        }//END While
    }//END MAIN
}//END class
