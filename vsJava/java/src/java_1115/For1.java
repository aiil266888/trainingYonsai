package java_1115;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        //1. 1~10까지 정수출력
        for(int i = 1; i<=10; i++){
            System.out.print(i +  " ");
        }
        System.out.println();

        //2. 50~100까지 정수
        for(int i = 50; i<=100; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //3. 1~20까지 정수중 짝수만 출력
        for(int i = 1; i<=20; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //4. 10~20까지 정수 중 홀수만 출력
        for(int i =11; i<=20; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        //5. 구구단 출력 (원하는 단을 입력받아 수식 출력)
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 단을 입력 : ");
        int gugu = scan.nextInt();

        System.out.println(gugu+"단");
        for(int i = 1 ; i<=9; i++){
            System.out.println( gugu + " X " + i + " = " + (gugu*i));
        }
        System.out.println();






    }
}
