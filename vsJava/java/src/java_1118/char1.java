package java_1118;

public class char1 {
    public static void main(String[] args) {
        String ssn = "789198456123";
        char sex = ssn.charAt(6);
        int len = ssn.length();

        switch(sex){
            case '1':
            case '3':
                System.out.println("남성입니다");
                break;
            case '2':
            case '4':
                System.out.println("여성입니다");
                break;

            default:
                break;

        }
    }
}
