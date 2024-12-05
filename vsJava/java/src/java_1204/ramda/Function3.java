package java_1204.ramda;
//함수형인터페이스
interface Calculator1 {
    int sum(int a, int b);
   
}


public class Function3 {
    public static void main(String[] args) {
        Calculator1 mc = Integer::sum; //각요소를 합산해라
       
        int result =  mc.sum(3,4);
        System.out.println((result));
    }
}
