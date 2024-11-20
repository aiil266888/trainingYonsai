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

    public static void question09(int insert){
        //학생들의 점수를 분석하는 프로그램 작성, 학생 수와 학생의 점수를 입력받고 최고 점수 및 평균점수 출력
        Scanner scan = new Scanner(System.in);
        int[][] total_student = new int[insert][4];
        int flag =0; //while문 메뉴출력 플래그
        int max = 0; //최댓값 저장
        double avg = 0; //평균저장
        int all_total =0; //모든 점수 총합

        System.out.println("------------------------------------------------------");
        System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
        System.out.println("------------------------------------------------------");
        System.out.print("선택 > ");
        int select = scan.nextInt();

        while(select != 5 ){
            if(flag == 1) {
                System.out.println("------------------------------------------------------");
                System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
                System.out.println("------------------------------------------------------");
                System.out.print("선택 > ");
                select = scan.nextInt();
            }

            if(select == 1){
                System.out.println("총 학생 수는" + insert + "명 입니다");
                flag = 1;
            }else if(select == 2){
                for (int i = 1; i <=insert; i++) {
                    System.out.println(i + "번째 학생의 [국어 영어 수학 과학] 점수를 차례대로 입력하세요");
                    for (int j = 0; j < 4; j++) {
                        total_student[i-1][j] = scan.nextInt();
                    }
                }
                System.out.println("입력이 완료되었습니다");
                flag = 1;
            }else if(select ==3){
                System.out.println("------------------------------");
                System.out.println("     국어 | 영어 | 수학 | 과학");

                for (int i = 0; i <insert ; i++) {
                    System.out.print("학생"+(i+1)+" : ");
                    for (int j = 0; j <4 ; j++) {
                        System.out.print(total_student[i][j]+ "    ");
                    }
                    System.out.println();
                }
                System.out.println("------------------------------");
                flag = 1;
            }else if(select ==4){
                    for (int i = 0; i <insert ; i++) {
                        max=total_student[i][0];
                        all_total = 0;
                        for (int j = 0; j <4 ; j++) {
                            all_total += total_student[i][j];
                            if(max<total_student[i][j]){
                                max = total_student[i][j];
                            }
                        }
                        avg = all_total/4;

                        if(max==0 && avg ==0){
                            System.out.println((i+1)+"번 학생의 점수를 등록해주세요");
                        }else {
                            System.out.println("학생" + (i + 1) + "의 최고 점수 : " + max);
                            System.out.println("학생" + (i + 1) + "의 평균 점수 : " + avg);
                            System.out.println("----------------------------------------");
                        }
                    }
                    all_total=0;
                    max = 0;
                for (int i = 0; i <4 ; i++) {
                        all_total=0;
                    for (int j = 0; j <insert ; j++) {
                        all_total += total_student[j][i];
                        if(max<total_student[j][i]){
                            max=total_student[j][i];
                        }
                    }
                    avg= all_total/insert;
                    switch(i){
                        case 0:
                            System.out.println("전체 학생의 국어 평균은 " + avg + "점 입니다");
                            System.out.println("전체 학생 중 국어 최고 점수는 " + max + "점 입니다");
                            break;
                        case 1:
                            System.out.println("전체 학생의 영어 평균은 " + avg + "점 입니다");
                            System.out.println("전체 학생 중 영어 최고 점수는 " + max + "점 입니다");
                            break;
                        case 2:
                            System.out.println("전체 학생의 수학 평균은 " + avg + "점 입니다");
                            System.out.println("전체 학생 중 수학 최고 점수는 " + max + "점 입니다");
                            break;
                        case 3:
                            System.out.println("전체 학생의 과학 평균은 " + avg + "점 입니다");
                            System.out.println("전체 학생 중 과학 최고 점수는 " + max + "점 입니다");
                            break;
                    }

                }

                flag = 1;
            }else if(select ==5){
                System.out.println("종료");
            }else{
                System.out.println("잘못 입력하셨습니다");
                flag = 1;
            }

        }//END while
    }

    public static void question09_1(){
        Scanner scan = new Scanner(System.in);

        int insert =0 ;
        System.out.print("학생 수를 입력하세요 : ");
        insert = scan.nextInt();

        question09(insert);
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
            case 9: question09_1(); break;
            default: question06();
        }
    }
}
