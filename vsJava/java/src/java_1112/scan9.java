package java_1112;

import java.util.Scanner;

public class scan9 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        //하나의 단어를 입력받아 그대로 출력해보자
        System.out.println();
        String a1 = scan.nextLine();

        //입력받은 단어를 그대로 출력한다
        System.out.println(a1);

        System.out.print("실수 입력 : ");
        float f1 = scan.nextFloat();

        System.out.println("입력된 실수 : " + f1);
        System.out.printf("변환된 실수 : %-10.2f",f1);
    }
}
