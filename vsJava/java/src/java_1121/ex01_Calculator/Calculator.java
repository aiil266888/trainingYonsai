package java_1121.ex01_Calculator;

public class Calculator {
//        1. 덧셈 : 실수 2개를 더함
//        2. 뺄셈 : 실수 2개를 뺄셈
//        3. 곱셈 : 실수 2개를곱셈
//        4. 나눗셈 : 실수 인자1/ 인자2 연산하는 나눗셈
//        5. 나머지 : 실수 인자1% 인자2 연산하는 나눗셈
//        6. 합계 : 배열을 매개변수로 전달받아 모든 요소의 합을 구함
//        7. 평균 : 배열을 매개변수로 전달받아 평균을 구함


    //덧셈
    public int plus (int a , int b){
        int result = a + b;
        return result;
    }
    //뺄셈
    public int minus (int a, int b){
        int result = a - b;
        return result;
    }
    //곱셈
    public double multiple (double x, double y){
        double result = x * y;
        return result;
    }
    //나눗셈
    public double divide(double x, double y ){
        double result = x / y;
        return result;
    }
    //배열의 합
    public int sum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    public double avg(int[] arr){
        int sum = sum(arr); //위의 sum함수를 불러옴
        double avg = (double)sum/arr.length;

        return avg;
    }

}

