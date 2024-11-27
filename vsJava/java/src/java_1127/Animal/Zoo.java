package java_1127.Animal;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //받은 답은 배열로 저장
        Animal[] animal = new Animal[3]; //최대 세마리 동물 관리
        int index = 0;

        while(true){
            if(index == animal.length )break; //배열꽉차면 종료

            System.out.println(" 1. 개 | 2. 새 | 3.물고기");
            System.out.print("동물을 선택하세요 >> ");
            String input = scan.next();
            System.out.println();

            if(input.equals("그만")) break;

            System.out.print("이름을 입력하세요 : ");
            String name = scan.next();
            System.out.println();
            System.out.print("나이를 입력하세요 : ");
            int age = scan.nextInt();
            System.out.println();

            //배열에 객체 저장
            switch(input){
                case "1" :
                    animal[index++] = new Dog(name,age);
                    break;
                case "2":
                    animal[index++] = new Bird(name,age);
                    break;
                case "3":
                    animal[index++] = new Fish(name,age);
                    break;
                default:
                    System.out.println("잘못된 내용입니다");
            }
        }

        System.out.println("------------동물 정보-------------");
        for(Animal animals : animal){
            //배열의 단점 ;;; 배열 총 갯수를 정해야 함
            if (animals == null) continue; //비어있는거 건너ㅜ띠기

            animals.sound();
            animals.move();
            animals.info();
            System.out.println();
        }
    }
}
