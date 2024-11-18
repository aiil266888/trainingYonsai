package java_1118;

public class SubString1 {
    public static void main(String[] args) {
     String ssn = "880812-1791673";
     String firstNum = ssn.substring(0,6); //0번째부터 6번째전까지 잘라내기 (-는 6)
     String secondNum = ssn.substring(7); //7부터 끝까지

        System.out.println(firstNum);
        System.out.println(secondNum);
    }
}
