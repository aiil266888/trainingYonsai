package java_1202.FileWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite4 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("c:/abc/out2.txt");
        for (int i = 1; i <11 ; i++) {

            //PrintWriter는 개행문자빼고 println써서 줄바꿈가능
            String data = i +"번째 줄입니다";
            pw.println(data);
        }
        pw.close();
    }
}

//File Writer를 이용하여 byte배열 대신 문자열을 사용한다

