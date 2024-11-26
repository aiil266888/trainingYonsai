package java_1126.Hak3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //사용자로부터 학생정보 입력하기
        System.out.print("학생 이름을 입력하세요");
        String  name = scan.nextLine();
        System.out.println();
        System.out.print("학번을 입력하세요");
        String studentId = scan.nextLine();
        System.out.println("학생 성적을 입력하세요");
        int score = scan.nextInt(0);

        //Grade 객체 생성
        Grade grade = new Grade(name, studentId, score);
    }
}
