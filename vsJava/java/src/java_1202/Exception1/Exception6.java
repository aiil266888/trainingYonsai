package java_1202.Exception1;

public class Exception6 {
    public static void main(String[] args) {
        String [] names  = {"kim", "Lee", "Park","Choi"};
        try{
            System.out.printf("0번 인덱스 요소: %s\n", names[0]);
            System.out.printf("1번 인덱스 요소: %s\n", names[1]);
            System.out.printf("2번 인덱스 요소: %s\n", names[2]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("인덱스 접근이 잘못되었습니다");
        }finally{
            System.out.println("finally 문은 예외발생과 상관없이 항상 수행됩니다");
        }
    }
}
