package java_1213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Brain implements Interface {

static HashMap<String , String> Word = new HashMap<>();
    static final String FILE_NAME = "C:\\junsuk\\vsjava\\java\\src\\a1213\\words2.txt";

    public Brain(){
       loadWordsFromFile();
    }

    private void loadWordsFromFile() {
      try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME), "UTF-8"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("=");
            if(parts.length == 2){
                Word.put(parts[0],parts[1]);
            } 
        }

      }catch(IOException e){
        System.out.println("파일을 읽는 중 오류가 발생했습니다.");
      }
    }
    @Override
    public void Menu() {
        // TODO Auto-generated method stub
        System.out.println("등록된 단어 수: \n" + Word.size());
        System.out.println("---- 선택 해주세요. ----");
        System.out.println("1. 단어 등록 ");
        System.out.println("2. 단어 조회 ");
        System.out.println("3. 단어 삭제 ");
        System.out.println("4. 테스트 ");
        System.out.println("5. 단어 목록보기 ");
        System.out.println("6. 종료 ");
        System.out.println("-----------------------");
    }


    @Override
    public void AddWord() {
        String Eng = null;
        String Kor = null;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("등록할 영단어를 입력하세요(목록으로 돌아가려면 Menu 입력) : ");
            Eng = sc.nextLine();
            if(Eng.equalsIgnoreCase("menu")){
                break;
            }else{
                if(Word.containsKey(Eng) == true){ //Word라는 맵에 입력한 단어가 있으면
                    System.out.println(" 이미 입력된 단어입니다. 수정을 원하시면 삭제 후 다시 입력해주세요.");
                }else{
                    System.out.print(" 뜻(한글)을 입력하세요 : ");
                    Kor = sc.nextLine();
                }
    
                try{
                    Word.put(Eng , Kor);
                    saveWordsToFile();
                    }catch(Exception e){
                        System.out.println("다시 입력해 주세요");
                        e.printStackTrace();
                    }finally{
                        System.out.println(" 입력되었습니다. ");
                    }
                }
    
            }
            
        }
                    
        private void saveWordsToFile() {
             try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FILE_NAME), StandardCharsets.UTF_8))) {
                    for(Map.Entry<String, String> entry : Word.entrySet()){
                        writer.write(entry.getKey() + "=" + entry.getValue());
                        writer.newLine();
                    }
                }catch(IOException e){
                    System.out.println("파일 저장중 오류가 났습니다.");
            }
        }
                    
                        @Override
    public void DeleteWord() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Exit() {
        // TODO Auto-generated method stub
        
    }

   

    @Override
    public void Test() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void WordList() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void WordSearch() {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("조회할 영단어를 입력하세요 (목록으로 돌아가려면 Menu입력) : ");
            String Eng= sc.nextLine();
            if(Eng.equalsIgnoreCase("menu")){
                break;
            }else{
                if(Word.containsKey(Eng)==true){
                    System.out.println(Word.get(Eng));

                }else{
                    System.out.println("등록되지 않은 단어입니다 ");
                }
            }
        }
        
    }
    
}
