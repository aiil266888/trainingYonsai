package java_1202.Exception1;

import java.io.*;

public class Exception4 {
    public static void main(String[] args) {
        //파일입출력
        //파일이 존재하지 않거나 읽기/쓰기 권한이 없을 때 발생하는 예외
        try{
            File file = new File("example.txt");
            if(file.exists()){ //파일이 있다면
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String line;
                while((line = br.readLine()) != null ){ //줄단위로 읽어왔을 때
                    System.out.println(line);
                }
                br.close();
            }else{
                System.out.println("파일을 찾을 수 없습니다" + file.getAbsoluteFile());
            }
        }catch (FileNotFoundException e){
            System.out.println("파일이 존재하지 않습니다" + e.getMessage());
        }catch(IOException e){
            System.out.println("파일을 읽는 도중 오류가 발생했습니다 " + e.getMessage());
        }
    }
}
