package java_1125.this1;

public class Main4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int  result1 = calculator.add(3,4);
        int  result2 = calculator.add(3,5,4);

        System.out.println(result1);
        System.out.println(result2);
    }
}

//메소드 오버로딩 : i j 든 i j k든 지정하는대로 자동처리
class Calculator{
    public int add(int i, int j){
        return i+j;
    }
    public int add(int i, int j, int k){
        return i+j+k;
    }
}