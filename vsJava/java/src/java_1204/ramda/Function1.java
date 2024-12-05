package java_1204.ramda;

interface Calculator2 {
    int sum(int a, int b);
}
class MyCalculator1 implements Calculator1 {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Function1 {
    public static void main(String[] args) {
        MyCalculator1 mc = new MyCalculator1();
        int result =  mc.sum(3,4);
        System.out.println((result));
    }
}
