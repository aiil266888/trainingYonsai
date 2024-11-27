package java_1127.shape;

import java.util.Scanner;

public class ShapeMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = null;
        double width = 0.0;
        double height = 0.0;
        double radius = 0.0;
        //총합
        double roundSum =0.0;
        double areaSum = 0.0;

        //입력답은 배열에 저장
        Shape[] shapeList = new Shape[3];
        int index = 0;

        while(true){
            if(index == 3) break;
            System.out.print(" 1. 삼각형 | 2. 사각형 | 3. 원형");
            System.out.println("도형을 선택하세요>>>");
            String input = sc.next();

            if(input.equals("그만")){ break;}

            switch(input){
                case "1" :
                    System.out.print("가로의 길이를 입력하세요 : ");
                    width = sc.nextDouble();
                    System.out.println();
                    System.out.print("높이의 길이를 입력하세요");
                    height = sc.nextDouble();
                    System.out.println();
                    shape = new Triangle(width,height); //업캐스팅
                    shapeList[index++] = shape;

                    break;
                case "2" :
                    System.out.print("가로의 길이를 입력하세요 : ");
                    width = sc.nextDouble();
                    System.out.println();
                    System.out.print("세로의 길이를 입력하세요");
                    height = sc.nextDouble();
                    System.out.println();
                    shape = new Rectangle(width,height);
                    shapeList[index++] = shape;
                    break;

                case "3" :
                    System.out.print("반지름의 길이를 입력하세요 : ");
                    radius = sc.nextDouble();
                    System.out.println();
                    shape = new Circle(radius);
                    shapeList[index++] = shape;
                    break;

                default:
                    break;
            }
        }



    }
}
