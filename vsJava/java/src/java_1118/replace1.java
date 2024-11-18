package java_1118;

public class replace1 {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다 자바 문자열은 String입니다";
        String newStr = oldStr.replace("자바", "Java");

        System.out.println(oldStr);
        System.out.println(newStr);//oldStr이 변경되는것이 아닌 문자열만 바꿔서 newStr에 저장
    }
}
