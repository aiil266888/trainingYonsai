package java_1127;

public class number {
    public static void main(String[] args) {
        int a = 5;
        double b =2.5;
        double result =a + b;
        System.out.println("결과 : " + result); //묵시적 형변환

        double d = 9.99;
        int r = (int)Math.round(d); //명시적 형변환
        int t = (int) d;
        System.out.println("반올림 값 : " + r);//출력 : 반올림값 10
        System.out.println("절삭 값 : " + d); //출력: 절삭값 9
        //int -> double 자동(묵시적) 데이터 손실 없음 - 형변환 필요 없음
        //double -> int 명시적(강제 형변환) - 소수점 아래제거 (손실) (int)붙여서 명시해줌
    }
}
