package java_1119;

import java.util.Scanner;

public class bankATM {
    public static void main(String[] args) {
        System.out.print("출금하실 금액을 입력하세요 >> ");
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();

        ATM(money);
    }

    private static void ATM(int money) {
        int p_50000 = 0;
        int p_10000 = 0;
        int p_5000 = 0;
        int p_1000 = 0;
        int p_500 = 0;
        int p_100 = 0;
        int p_50 = 0;
        int p_10 = 0;
        int p_5 = 0;
        int p_1 = 0;

        if(money/50000>=1) {
            p_50000=(money/50000);
            money -=(p_50000*50000);
        }
        if(money/10000>=1) {
            p_10000=(money/10000);
            money -=(p_10000*10000);
        }
        if(money/5000>=1) {
            p_5000=(money/5000);
            money -=(p_5000*5000);
        }
        if(money/1000>=1) {
            p_1000=(money/1000);
            money -=(p_1000*1000);
        }
        if(money/500>=1) {
            p_500=(money/500);
            money -=(p_500*500);
        }
        if(money/100>=1) {
            p_100=(money/100);
            money -=(p_100*100);
        }
        if(money/50>=1) {
            p_50=(money/50);
            money -=(p_50*50);
        }
        if(money/10>=1) {
            p_10=(money/10);
            money -=(p_10*10);
        }
        if(money/5>=1) {
            p_5=(money/5);
            money -=(p_5*5);
        }
        if(money>=1){
            p_1=(money/1);
        }

        System.out.println("오만원권 : "+ p_50000 + "매");
        System.out.println("만원권 : "+ p_10000 + "매");
        System.out.println("오천원권 : "+ p_5000 + "매");
        System.out.println("천원권 : "+ p_1000 + "매");
        System.out.println("오백원 : "+ p_500 + "개");
        System.out.println("백원 : "+ p_100 + "개");
        System.out.println("오십원 : "+ p_50 + "개");
        System.out.println("십원 : "+ p_10 + "개");
        System.out.println("오원 : "+ p_5 + "개");
        System.out.println("일원 : "+ p_1 + "개");

    }
}
