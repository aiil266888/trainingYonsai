package java_1113;

public class Ari2 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;
        double result = apple - number * pieceUnit;

        System.out.println("사과10조각에서 남은 양 : " + result);
        System.out.println("사과 한개에서 남은 양 : " + result/10.0);

        //BigDecimal 사용

    }
}

