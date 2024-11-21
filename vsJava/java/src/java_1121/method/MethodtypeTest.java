package java_1121.method;

import com.sun.jdi.Method;

import java.util.Scanner;

public class MethodtypeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int number = scan.nextInt();
        float multi1 = scan.nextFloat();
        float multi2 = scan.nextFloat();

        //MethodType
        MethodType test = new MethodType();

        test.printName();
        test.printNumber();
        test.multiply(2,4.5);
    }
}
