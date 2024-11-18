package java_1118;

public class string {
    public static void main(String[] args) {
        //String은 참조  타입
        String a = "Hello";
        String b = "Hello";
        String c = "Hello";

        String d = new String("Hello");
        String e = new String("Java");
        String f = new String("Java");


        System.out.println(a == c); //true
        System.out.println(a == d); //false
        System.out.println(a.equals(d));
    }
}
