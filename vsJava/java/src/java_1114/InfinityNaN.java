package java_1114;

public class InfinityNaN {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;

        //잘못된 코드
        //double z = x / y; //Infinity => 무한대
        double z = x % y; // NaN => Not a Number
        //System.out.println(z+2);

        //알맞은 코드
        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값산출불가");
        }else{
            System.out.println(z+2);
        }
    }
}
