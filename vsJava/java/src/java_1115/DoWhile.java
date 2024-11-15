package java_1115;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do{//조건과 상관없이 무조건 한번은 실행
            System.out.print("숫자를 입력하세요");
            number =  sc.nextInt();
            System.out.println("입력한 숫자 : "+ number);
        }while(number != 0);
        System.out.println("프로그램 종료");

    }
}
