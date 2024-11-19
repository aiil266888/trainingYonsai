package java_1119;

import java.util.Scanner;

public class homwork {
    public static void question06(){
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        System.out.println(array.length); //3
        System.out.println(array[2].length); //5
    }
    public static void question07(){
    //주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요(for문이용)
        int[] array = {1,5,3,8,2};
        int max =  0;
        for (int i = 0; i <array.length ; i++) {
          max = Math.max(max,array[i]);
        }
        System.out.println(max);

    }
    public static void question08(){
        //주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성 (중첩 for문 이용)
        int[][] array ={
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int sum = 0;
        int total = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                sum += array[i][j];
                total++;
            }
        }

        System.out.println("총 평균 : " + (sum/total));
        System.out.println("총 인원 : " + total);
    }//END question08

    public static void question09(array otal_student){
        //학생들의 점수를 분석하는 프로그램 작성, 학생 수와 학생의 점수를 입력받고
        //while문과 Scanner의 nextLine()메소드를 이용해서 최고 점수 및 평균점수 출력
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
        System.out.println("------------------------------------------------------");
        System.out.print("선택 > ");
        int select = scan.nextInt();

        if(select == 1){
            System.out.println("총 학생 수는" + total_student.length + "명 입니다");
        }else if(select ==2){
            if(insert==0){
                System.out.println("학생수를 입력해주세요");
                question09();
            }
            for (int i = 0; i <insert; i++) {
                System.out.println(i + "번째 학생의 국어 영어 수학 과학 점수를 차례대로 입력하세요");
                for (int j = 0; j < 4; j++) {
                    total_student[i][j] = scan.nextInt();
                }
            }

        }else if(select ==3){

        }else if(select ==4){

        }else if(select ==5){

        }else{
            System.out.println("다시 입력해주세요");
            question09();
        }


    }

    public static void question09_1(){
        Scanner scan = new Scanner(System.in);

        int insert =0 ;
        System.out.print("학생 수를 입력하세요 : ");
        insert = scan.nextInt();
        int[][] total_student = new int[insert][4];

    }


    public static void main(String[] args) {

        System.out.print("실행할 문제 번호 입력 : ");
        Scanner scan = new Scanner(System.in);
        int insert = scan.nextInt();
        System.out.println();
        switch(insert){
            case 6: question06(); break;
            case 7: question07(); break;
            case 8: question08(); break;
            case 9: question09(); break;
            default: question06();
        }
    }
}
