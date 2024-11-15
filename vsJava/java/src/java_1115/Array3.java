package java_1115;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        //키보드로 정수n을 입력받아 n개만큼의 숫자를 입력받고 가장 큰 값을 출력
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num =  scan.nextInt();
        System.out.println("------------------------");
        int max = 0;
        int min = 0;


        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+"번째 정수 입력 : ");
            arr[i] =  scan.nextInt();
            System.out.println();

            if(arr[i]>max){//최댓값 비교
                max = arr[i];
            }
            if (min == 0) {//초기 0값을 교체
                min = arr[i];
            }
            if(arr[i]<min){//최솟값 비교
                min = arr[i];
            }
        }
        System.out.println("가장 큰 정수 : " + max);
        System.out.println("가장 작은 정수 : " + min);

    }
}
