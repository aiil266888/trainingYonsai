package java_1113;

import java.util.Scanner;

public class PosMax1 {
    public static void main(String[] args) {
        //세 개의 정수를 입력받아, 그 중에서 가장 큰 숫자를 출력하는 프로그램을 작성하세요.
        //출력 예시: "가장 큰 숫자는 X입니다."
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();
        System.out.println("세번째 숫자를 입력하세요 : ");
        int num3 = scanner.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("가장 큰 숫자는 "+ num1 + "입니다");
            }else{
                System.out.println("가장 큰 숫자는 "+ num3 + "입니다");
            }
        }else{
            if(num2>num3){
                System.out.println("가장 큰 숫자는 "+ num2 + "입니다");
            }else{
                System.out.println("가장 큰 숫자는 "+ num3 + "입니다");
            }
        }
    }
}
