package java_1113;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        int num = 12, num2 =9;
        //두 정수가 주어졌을 때,  그 중 더  큰 값을 출력하는 프로그램을 작성
        int result = (num>=num2) ? num : num2;
        System.out.println(result);

        //점수에 따른 등급 분류
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score>80)? 'B' : 'C');
        System.out.println(score + "점은 "+grade + "등급입니다");

        //주어진 나이에 따라 어린이 청소년 성인을 분류
        Scanner scan = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = scan.nextInt();

        String result3 = (age < 12)? "어린이" : ((age<19)?"청소년":"성인");
        System.out.println("당신은 " +  result3 + " 입니다");

        //양수 음수 0 판별
        System.out.print("양수 음수 0을 판별합니다 숫자 입력 : ");
        int choice = scan.nextInt();

        if(choice>0){
            System.out.println("양수입니다");
        }else if(choice<0){
            System.out.println("음수입니다");
        }else{
            System.out.println("0입니다");
        }

    }
}
