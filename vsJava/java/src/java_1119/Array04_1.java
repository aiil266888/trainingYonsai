package java_1119;

import java.util.Random;

public class Array04_1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = random.nextInt(100);
        }
        int max = numbers[0]; //배열의 첫 번째를 최대값에 대입
        int min = numbers[0];//배열의 첫 번째를 최소값에 대입
        for(int number : numbers){
            max = Math.max(max,number);
            min = Math.min(min,number);
        }
        System.out.println("최댓값 :" + max);
        System.out.println("최솟값 :" + min);
        //컴퓨터에게 숫자 배열의 i번째 자리에 0~99사이의 랜덤한 숫자를 하나 넣는다

    }
}
