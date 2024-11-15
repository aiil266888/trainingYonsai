package java_1115;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        int money = 0;
        int select;

        do {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
            System.out.println("---------------------------------");
            select = scan.nextInt();
            System.out.println("선택 > " + select);


            switch(select){
                case 1:
                    System.out.print("예금할 금액을 입력하세요 > ");
                    int input = scan.nextInt();
                    money +=  input;
                    System.out.println("잔고 > " + money);
                    break;
                case 2:
                    System.out.println("출금할 금액을 입력하세요 > ");
                    int output = scan.nextInt();
                    if((money-output<0)){
                        System.out.println("잔고가 부족합니다");
                        break;
                    }
                    money -= output;

                case 3:
                    System.out.println("잔고 > " + money);
                case 4:
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다");
            }
        }while(select !=4);
        System.out.println("프로그램 종료");
    }
}
