package java_1118;

public class Array1 {
    public static void main(String[] args) {
        //배열변수 선여과 배열 생성
        String[] season = {"Spring","Summer","Fall","Winter"};
        //배열의 항목값 읽기

        for(int i = 0; i< season.length; i++){
            System.out.println(i + "Season : " + season[i]);
        }

        //인덱스1 항목의 값의 변경
        season[1] = "여름";
        System.out.println("season[1] : "+season[1]);
        
        //배열 변수 선언과 배열  생성
        int[] scores = {83,90,87};
        //총합과 평균 구하기
        int add = 0;
        float avg;
        for (int i = 0; i < scores.length; i++) {
            add += scores[i];
        }
        avg = add/scores.length;
        System.out.println("점수의 총 합계 : " + add);
        System.out.println("점수의 평균 : " +  avg);
        System.out.printf("printf로 표현 : %.1f\n" , avg);
        
    }
}
