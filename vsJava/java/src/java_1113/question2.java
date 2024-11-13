package java_1113;

import java.util.Scanner;



public class question2 {
    public static void quest1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int var1 = scan.nextInt();

        if(var1%2 == 0){
            System.out.println("짝수입니다");
        }else{
            System.out.println("홀수입니다");
        }
    }

    public static void quest2(){
        int num = 0;
        for(int i=1; i<101; i++){
            num = i+num;
//            System.out.print(" " + num);
        }
        System.out.println("1부터 100의 합계 :  " + num);
    }

    public static void quest3(){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int var1 = scan.nextInt();

        int num = 0;
        for(int i=1; i<=var1; i++){
            num = i+num;

        }
        System.out.println("1부터" + var1 + "까지의 합계 :  " + num);
    }

    public static void quest4(){
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 구구단 입력 : ");
        int gugu = scan.nextInt();
        System.out.println(gugu+"단");
        for(int i=1; i<=9; i++){
            System.out.println(gugu + " X " + i + " = " + (gugu*i));
        }
    }

    public static void quest5(){
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int number1 = scan.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int number2 = scan.nextInt();
        System.out.print("세 번째 정수 입력 : ");
        int number3 = scan.nextInt();

        System.out.println("입력한 정수 : " + number1 + " " + number2 + " " + number3);
        System.out.println("입력한 정수의 합 : " + (number1+number2+number3));
        System.out.printf("입력한 정수의 평균 : %-10.2f\n",(float)(number1+number2+number3)/3);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("실행할 함수번호 입력 : ");
        var want = scan.nextInt();
        switch (want){
            case 1://정수를 입력받아 짝수인지  홀수인지 판별하는 프로그램
                quest1();
                break;
            case 2://1부터 100까지의 합
                quest2();
                break;
            case 3://1부터 입력받은 숫자까지의 합
                quest3();
                break;
            case 4://입력받은 숫자의 구구단을 출력
                quest4() ;
                break;
            case 5: //3개의 정수를 입력받고 합과 평균을 출력
                quest5();
                break;
        }//END switch
    }//END MAIN
}
