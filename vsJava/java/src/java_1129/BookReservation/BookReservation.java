package java_1129.BookReservation;

import java.util.Scanner;

public class BookReservation {
    public static void main(String[] args) {
        BookManager manager = new BookManager();//예약관리 객체
        Scanner scan = new Scanner(System.in);
        boolean flag= true;
        int choose;


        while(flag){
            System.out.println(" >>>>도서관리 시스템입니다 원하는 메뉴를 선택해주세요<<<< ");
            System.out.println("1. 대출가능 도서 일람");
            System.out.println("2. 도서대출");
            System.out.println("3. 도서반납");
            System.out.println("4. 도서검색");
            System.out.println("5. 종료");
            System.out.print("원하는 작업을 선택하세요 >> ");

            choose = scan.nextInt();
            scan.nextLine();//메모리에 있는 개행문자 삭제

            switch (choose){
                case 1://대출가능 도서일람


                    break;
                default:
                    System.out.println("다시 입력해주세요 ");
                    break;
            }//END switch
        }//END while
    }//END MAIN
}//END BookReservation Class
