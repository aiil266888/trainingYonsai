package java_1114;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //계절판별
        System.out.print("월을 입력하세요 : ");
        int month = scan.nextInt();

        switch(month){
            case 3,4,5 :
                System.out.println("봄 입니다");
                break;
            case 6,7,8 :
                System.out.println("여름 입니다");
                break;
            case 9,10,11 :
                System.out.println("가을 입니다");
                break;
            default:
                System.out.println("겨울 입니다");
        }

        //윤년판별 삼항연산자
        System.out.print("확인할 연도를 입력하세요 : ");
        int year =  scan.nextInt();
        String result = (year%4==0 || year%400==0) ? "윤년입니다":"윤년이 아닙니다";

        System.out.println(result);

    }
}
