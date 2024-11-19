package java_1119;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        //정수 10개를 저장할 수 있는 배열을 생성하고 각 요소에 1부터 10까지 저장
        //그리고 모든 요소으 ㅣ합을 구하여 출력
        int[] numbers = new int[10];
        int sum  = 0;

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = i+1;
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("배열의 모든 합 =" + sum);

    }
}
