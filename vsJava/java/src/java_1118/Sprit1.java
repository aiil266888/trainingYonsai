package java_1118;

public class Sprit1 {
    public static void main(String[] args) {
        String board = "1,자바학습,참조타입 String을 학습합니다.,홍길동";
        //문자열을 배열로 분리

        String[] tokens = board.split(",");

        for(int i = 0; i<tokens.length; i++){
            System.out.println( i+"번 :" + tokens[i]);
        }
    }
}
