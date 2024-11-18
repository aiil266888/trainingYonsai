package java_1115;

import java.util.Scanner;

public class homeWork {
    public static void item() {
        int num = 0;
        String[] insert = new String[10];
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("===================================================");
            System.out.println("1.아이템 추가 | 2. 아이템 삭제 | 3. 카트 확인 | 4.종료");
            System.out.println("===================================================");
            System.out.print("번호를 입력하세요 > ");
            num = scan.nextInt();
            System.out.println();

            switch (num) {
                case 1:
                    System.out.println("아이템을 추가합니다");
                    System.out.print("추가할 아이템을 적어주세요 >");
                    insert[0] = scan.nextLine();
                    System.out.println(insert[0]+"이(가) 카트에 추가되었습니다");
                    break;

                case 2:
                    System.out.println("아이템을 삭제합니다");
                    System.out.print("삭제할 아이템 > ");


                break;
            }
        } while (num != 4);
    }

    public static void number3() {
        System.out.println("1부터 100까지의 3의배수 합계를 출력합니다");
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                result = +i;
            }
        }
        System.out.println("3의 배수 총 합 : " + result);
    }

    public static void number4() {
        System.out.println("주사위 눈의 합계가 5가 될 때 까지 출력합니다");
        int number1;
        int number2;
        boolean flag = true;

        while (flag) {
            number1 = (int) (Math.random() * 6 + 1);
            number2 = (int) (Math.random() * 6 + 1);
            System.out.println("(" + number1 + "," + number2 + ")");
            if ((number1 + number2) == 5) {
                flag = false;
            }
        }
    }

    public static void number5() {
        System.out.println("방정식 4x + 5y = 60의 모든 해를 구해서 출력합니다");
        for (int x = 0; x <=10 ; x++) {
            for (int y = 0; y <= 10 ; y++) {
                if((4*x)+(5*y)==60){
                    System.out.println("("+x+","+y+")");
                }
            }
        }
    }

    public static void number6() {
        System.out.println("for문을 이용해 별을 표시합니다");
        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j<=i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. 아이템 추가 삭제 ");
        System.out.println("2. 확인문제 3번 ");
        System.out.println("3. 확인문제 4번 ");
        System.out.println("4. 확인문제 5번 ");
        System.out.println("5. 확인문제 6번 ");

        System.out.print("실행할 번호를 입력하세요 : ");
        int select_num = scan.nextInt();

        switch (select_num) {
            case 1://아이템 추가 삭제 do-while문
                item();
                break;
            case 2://확인문제 3번 for문을 이용해서 1부터 100까지의 정수 중 3의 배수 총합 출력
                number3();
                break;
            case 3://확인문제 4번 while과 random메소드로 주사위 눈을 출력 합이 5면 실행을 멈춤
                number4();
                break;
            case 4://확인문제 5번 방정식 4x + 5y = 60의 모든 해를 구함
                number5();
                break;
            case 5://확인문제 6번 for문을 이용한 별 찍기
                number6();
                break;
            default:
                item();
        }


    }
}
