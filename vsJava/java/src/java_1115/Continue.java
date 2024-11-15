package java_1115;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        //5개의 정수를 입력받아
        //입력받은 수 중
        Scanner sc =new Scanner(System.in);
        int sum = 0; //합계
        for(int i = 0; i<5; i++){
            System.out.printf("정수 입력 : ");
            int n = sc.nextInt();
            if(n<0){
                continue;
                //남은 실행문을 무시하고 다음 반복으로 점프
            }
            sum =+n;
        }
        System.out.println("양수의 합 : " + sum);
        sc.close();
    }
}
