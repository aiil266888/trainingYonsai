package java_1113;

public class test1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
        System.out.println(y);

        int score = 85;
        String result = (!(score>90))? "가":"나";
        System.out.println(result);

        int num1 = 10;
        int num2 = 5;
        System.out.println((num1>7 && (num2<=5)));
        System.out.println((num1%3 ==2) || (num2%2 !=1));
    }
}
