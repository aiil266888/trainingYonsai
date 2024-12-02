package java_1202.file;

import java.io.IOException;
import java.io.InputStream;

public class Input1 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        //InputStream read 메서드는 1byte크기의 사용자 입력을 받아들인다
        int a;
        a = in.read();
        System.out.println(a);
    }
}
