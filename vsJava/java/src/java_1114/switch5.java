package java_1114;

import java.sql.SQLOutput;

public class switch5 {
    public static void main(String[] args) {
        char grade = 'A';

        switch(grade){
            //이렇게 생략도 가능
            case 'A', 'a' -> System.out.println("우수회원 입니다");
            case 'B', 'b' -> System.out.println("일반회원 입니다");
            default -> System.out.println("손님 입니다");
        }

        //12 이전 문법
        String grades = "E";
        int score1 = 0;
        switch(grades){
            case "A":
                score1 = 100;
                break;
            case  "B":
                int result =  100-20;
                score1 =result;
                break;
            default:
                score1 =60;
        }
        System.out.println("score1 : " + score1);

    }
}
