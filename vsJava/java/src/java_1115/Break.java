package java_1115;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //문자열.equal("비교문자열")
        //문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드

        while (true){
            System.out.print("입력 : ");
            String str =sc.nextLine();
            if(str.equals("q")){
                break;
            }
            System.out.println("입력받은 문자 : "+str);
        }
        System.out.println("프로그램을 종료합니다");
        sc.close();
    }
}
