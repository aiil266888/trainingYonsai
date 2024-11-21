package java_1121.method;

import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        int a = 0;
        int b = 0;
        System.out.print("사각형 세로의 길이를 입력 : ");
        a = scan.nextInt();
        System.out.print("사각형 가로의 길이를 입력 : ");
        b = scan.nextInt();

        rect.setDimension(a,b);//가로 세로 길이를 설정한다/ 가로만 입력받아 정사각형으로 계산한다
        rect.getArea(a,b); //사각형의 면적을 계산한다
        rect.getPerimeter(a,b); //사각형의 둘레를 계산한다

    }
}

