package java_1129.BookReservation;

import java.util.Scanner;

public class BookReservation {
    public static void main(String[] args) {
        BookDAO manager = new BookDAO();//예약관리 객체
        Scanner scan = new Scanner(System.in);
        boolean flag= true;
        int choose;

        while(flag){
            System.out.println(" >>>>도서관리 시스템입니다 원하는 메뉴를 선택해주세요<<<< ");
            System.out.println("1. 도서목록 조회");
            System.out.println("2. 도서 추가");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 수정");
            System.out.println("5. 종료");
            System.out.print("원하는 작업을 선택하세요 >> ");

            choose = scan.nextInt();
            scan.nextLine();//메모리에 있는 개행문자 삭제

            if(choose == 1){
                manager.printAll();
            }else if(choose == 2) {
                manager.insertNew();
            }else if(choose == 3){
                manager.removeBook();
            }else if(choose == 4){
                manager.updateBook();
            }else if(choose == 5){
                System.out.println("시스템을 종료합니다");
                scan.close();
                System.exit(0);
            }

        }//END while
    }//END MAIN
}//END BookReservation Class
