package java_1119;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int size = sc.nextInt();
        int[] insert = new int[size];

        for (int i = 0; i <insert.length ; i++) {
            System.out.print((i+1)+"번째 숫자 입력 : ");
            insert[i] = sc.nextInt();
        }

        for(int numbers : insert){
            System.out.print(numbers + " ");
        }
    }
}
