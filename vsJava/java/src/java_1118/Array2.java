package java_1118;

public class Array2 {
    public static void main(String[] args) {
        int[] scores = {83,90,87};
        //총합과 평균 구하기
        int add = 0;
        for (int i = 0; i < scores.length; i++) {
            add += scores[i];
        }
        System.out.println("점수의 총 합계 : " + add);

        //배열을 매개값으로 주고printItem메소드 호출
        printItem(new int[] {83,90,87});
    }

    //printItem 메소드 선언
    private static void printItem(int[] scores) {
        //매개변수가 참조하는 배열의 항목을 출력
        for(int i = 0; i<3; i++){
            System.out.println("scores[" + i + "] : " + scores[i]);
        }
    }
}
