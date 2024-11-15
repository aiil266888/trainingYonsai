package java_1115;

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 입력 : ");
        int num = sc.nextInt();

        for(int i = 1; i<= num; i++){
            for(int j = 1;  j<=num; j++){
                System.out.print("*");
            }
            System.out.println(); //별을 다섯개 찍고 줄바꿈
        }
    }
}
