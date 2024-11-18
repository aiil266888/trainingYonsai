package java_1118;

import java.util.Arrays;

public class Shuffle1 {

    public static void lotto(){
            int[] ball = new int[45];
            for(int i=0;i < ball.length;i++){
                ball[i] =i+1;
            }
            // System.out.println(Arrays.toString(ball));
            int n =0;
            int tmp = 0;
            for(int i=0; i < 1000; i++ ){
                n = (int)(Math.random() * 45);
                tmp = ball[0];
                ball[0] = ball[n];
                ball[n] = tmp;
            }
            System.out.println(Arrays.toString(ball));
            for(int i=0; i < 6;i++){
                System.out.printf("ball[%d]=%d\n",i, ball[i]);
            }
        }


    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }

        //배열의 내용을 문자열로 변환
        System.out.println(Arrays.toString(numArr));
        //Arrays.toString 사람이 읽을 수 있는 형식으로 배열 내용 확인

        for(int i = 0; i<100; i++){
            int n = (int)(Math.random()*10);//0~9까지 나옴
            int tmp = numArr[0];
            numArr[0] = numArr[n];
        }

        System.out.println(Arrays.toString(numArr));

        lotto();
    }



}
