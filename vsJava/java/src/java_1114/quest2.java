package java_1114;

import java.util.Scanner;

public class quest2 {

    public static void question1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("월을 입력하세요 : ");
        int month = scan.nextInt();

        System.out.println("입력한 월 : " + month);

        if(month>=3 && month<=5){
            System.out.println("봄입니다");
        }else if(month>=6 && month<=8){
            System.out.println("여름입니다");
        }else if(month>=9 && month<=11){
            System.out.println("가을입니다");
        }else if(month==12 || month==1 || month==2){
            System.out.println("겨울입니다");
        }else{
            System.out.println("다시 입력해주세요");
            question1();
        }
    }

    public static void question2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("년을 입력하세요 : ");
        int years = scan.nextInt();

        if(years%4 == 0){
            if(years%100 == 0){
                if(years%400==0){
                    System.out.println("윤년입니다"); return;
                }else{
                    System.out.println("윤년이 아닙니다"); return;
                }
            }
            System.out.println("윤년입니다");
        }else{
            System.out.println("윤년이 아닙니다");
        }
    }

    public static void question3(){
        Scanner scan = new Scanner(System.in);
        System.out.print("년을 입력하세요 : ");
        int years = scan.nextInt();

        if((years % 4 == 0 && 100 !=0) || years % 400 == 0)
            System.out.println("윤년 입니다");
        else
            System.out.println("윤년이 아닙니다");
    }

    public static void main(String[] args) {
        //달을 입력받아 계절을 구분
        question1();
        //년을 입력받아 윤년인지 아닌지 판별
        question2();
        //윤년구분 2
        question3();

    }


}
