package java_1202.FileWrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:/abc/out1.txt");
        for (int i = 1; i <11 ; i++) {
            String data = i +"번째 줄입니다 \r\n";
            fw.write(data);
        }
        fw.close();
    }
}

//File Writer를 이용하여 byte배열 대신 문자열을 사용한다

