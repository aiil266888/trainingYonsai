package java_1113;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("첫 번째 정수를 입력하세요 : ");
        var var1 = scan.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        var var2 = scan.nextInt();

        System.out.println(var1+" + "+var2+" = "+  (var1+var2));
        System.out.println(var1+" - "+var2+" = "+  (var1-var2));
        System.out.println(var1+" * "+var2+" = "+  (var1*var2));
        System.out.println(var1+" / "+var2+" = "+  (var1/var2));
        System.out.println(var1+" % "+var2+" = "+  (var1%var2));

        System.out.printf("%d + %d = %d\n",var1,var2, (var1+var2));
    }
}
