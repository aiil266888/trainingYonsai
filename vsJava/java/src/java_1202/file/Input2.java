package java_1202.file;

import java.io.IOException;
import java.io.InputStream;

public class Input2 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        int a;
        int b;
        int c;
        a = in.read();
        b = in.read();
        c = in.read();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //사용자가 입력한 문자에 해당하는 아스키코드값 출력
    }
}
