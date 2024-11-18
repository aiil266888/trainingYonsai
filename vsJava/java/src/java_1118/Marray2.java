package java_1118;

import java.util.Scanner;

public class Marray2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][] scores = new  int[3][3];
        for (int i = 0; i < scores.length ; i++) {
            System.out.println("학생 "+ (i+1)+ "의 국어 영어 수학 점수를 입력하세요 : ");
            for (int j = 0; j < scores.length ; j++) {
                scores[i][j] = sc.nextInt();
                System.out.println();
            }
        }

        for(int i = 0; i < scores.length ; i++) {
            for (int j = 0; j < scores.length ; j++) {
                System.out.print("[" + scores[i][j] + "]");
            }
            System.out.println();
        }

    }
}
