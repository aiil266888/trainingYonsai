package SemiProject;

import java.util.Scanner;

import static SemiProject.Logincheck.modifyInformation;
import static SemiProject.Logincheck.surchingList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Id;
        String Pw;
        int choice;
        int Adminflag = 0;
        Logincheck check = new Logincheck(); //실행 동시에 더미데이터 삽입

        Outter:while(true) {
            System.out.println("===================================================================");
            System.out.println("|                J  A  V  A  사  원  관  리 프  로  그  램            |");
            System.out.println("===================================================================");
            System.out.println("|     1.    LOGIN              |            2.  프로그램 종료        |");
            System.out.println("===================================================================");
            System.out.print(" >> ");
            choice = scan.nextInt();

            switch (choice){
                case 1:



                    System.out.println("=============L O G I N =============");
                    System.out.print(" ID >>  ");
                    Id = scan.next();
                    System.out.print("PASSWORD >> ");
                    Pw = scan.next();

                    //로그인체크
                    Logincheck lg = new Logincheck();//로그인체크 객체 생성
                    lg.checkLogin(Id, Pw);

                    //관리자 체크
                    if (Id.equals("admin")) {
                        Adminflag = 1;
                    }

                    //관리자 or 일반유저 분기점
                    if (Adminflag == 1) {//관리자메뉴
                        admin_Outer:while (true) {
                            System.out.println("==========================관리자 전용 화면입니다===========================");
                            System.out.println("1. 신규사원 등록\n2. 사원목록 조회\n3. 사원정보 변경\n4. 사원 삭제\n5. 로그아웃");
                            System.out.print("메뉴선택 >> ");
                            int amenu = scan.nextInt();
                            switch (amenu) {
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
                                case 5: //로그아웃
                                    System.out.println("로그인 화면으로 돌아갑니다");
                                    Adminflag = 0;
                                    break admin_Outer;
                            }
                        }//END admin_while
                    }else{//일반유저용 메뉴
                        abstract_Outer:
                        while (true) {
                            System.out.println("==========================사원용 화면입니다===========================");
                            System.out.println("1. 사원목록 조회\n 2. 정보변경\n3. 로그아웃");
                            System.out.print("메뉴선택 >> ");
                            int menu = scan.nextInt();
                            switch (menu) {
                                case 1: // 사원목록 조회:
                                    surchingList(Id);
                                    break;
                                case 2: // 개인정보 변경
                                    modifyInformation(Id);
                                    break;
                                case 3: //프로그램 종료
                                    System.out.println("로그인 화면으로 돌아갑니다");
                                    break abstract_Outer;
                            }
                        }//END abstract_while
                    }
                    break;
                case 2:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다");
                    break;
            }//END switch
        }//END ALL_while
    }//END MAIN
}//END class
