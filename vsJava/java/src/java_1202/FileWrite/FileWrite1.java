package java_1202.FileWrite;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/abc/out.txt");
        for (int i = 1; i <11 ; i++) {
            String data = i +"번째 줄입니다 \r\n";
            output.write(data.getBytes());
        }
        output.close();
    }
}

//OutputStream은 InputStream과 마찬가지로 byte 단위로 데이터 처리
//FileOutputStream은 OutputStream클래스를 상속 받아 역시 byte단위로 데이터 처리
//FileOutputStream은 byte단위로 처리해야 하므로 String->byte배열로 바꾸어주는 getByte()메서드사용
// \r\n은 줄바꿈 문자
//유닉스는 \n만 있으면 되지만 윈도우에서는 \r\n으로 작성해야
//노트패드 같은 에디터에서 줄바꿈이 제대로 표기된다