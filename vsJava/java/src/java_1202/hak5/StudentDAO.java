package java_1202.hak5;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
    FileClass file = new FileClass("student", "student_Grade");//파일만들기
    private ArrayList<java_1202.hak5.StudentDTO> slist;
    Scanner sc = new Scanner(System.in);
    public StudentDAO(){ //생성메서드
        slist = new ArrayList<java_1202.hak5.StudentDTO>();
        //기본데이터 - 4명의 더미데이터 생성
        java_1202.hak5.StudentDTO s1 = new java_1202.hak5.StudentDTO(0,"테스트1",11,100,90,80);
        java_1202.hak5.StudentDTO s2 = new java_1202.hak5.StudentDTO(1,"테스트2",22,90,89,91);
        java_1202.hak5.StudentDTO s3 = new java_1202.hak5.StudentDTO(2,"테스트3",33,85,77,55);
        java_1202.hak5.StudentDTO s4 = new java_1202.hak5.StudentDTO(3,"테스트4",44,77,68,85);
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);
        slist.add(s4);
        // System.out.println(slist);
        //StudentDTO s = new StudentDTO(1,"테스트2", 22, 55,66,77);
    }
    private void insert(java_1202.hak5.StudentDTO s) {
        slist.add(s);
    }
    private void delete(int index) {
        slist.remove(index);
        //remove - ArrayList에서 리스트 한줄 삭제(인덱스번호)
    }
    private java_1202.hak5.StudentDTO select(int index) {
        return slist.get(index);
    }           
    private void updete(int index, java_1202.hak5.StudentDTO s) {
       slist.set(index, s); 
    }   






    public void userInsert() {

        // System.out.println("<학생을 추가하기>");
        // System.out.print("이름 :");
        // String name = sc.next();
        // System.out.print("나이 :");
        // int age = sc.nextInt();
        // System.out.print("국어 :");
        // int kor = sc.nextInt();
        // System.out.print("영어 :");
        // int eng = sc.nextInt();
        // System.out.print("수학 :");
        // int math = sc.nextInt();
        // StudentDTO student = new StudentDTO(slist.size(), name, age,kor ,eng ,math);

        // slist.add(student);
        // System.out.println(slist);
        java_1202.hak5.StudentDTO s = new java_1202.hak5.StudentDTO();
        s.setId(slist.size());
        System.out.println("<학생 추가하기>");
        System.out.print("이름 : " );
        s.setName(sc.next());
        System.out.print("나이 : ");
        s.setAge(sc.nextInt());
        System.out.print("국어점수 : ");
        s.setKor(sc.nextInt());
        System.out.print("영어점수 : ");
        s.setEng(sc.nextInt());
        System.out.print("수학점수 : ");
        s.setMath(sc.nextInt());          
        
        insert(s);
         System.out.println("학생이 추가 되었습니다.");
        
    }
    public void userDelete() {
        System.out.println("<학생정보삭제>");
        int index = searchIndex();
        if(index == -1){
            System.out.println("찾는 학생이 없습니다.");
        }else{
            String name = slist.get(index).getName();
            delete(index);
                //slist.remove(index);
                System.out.println(name + "학생정보를 삭제했습니다.");
            } 
            
        }
    
                
        private int searchIndex() {
        int index = -1;
        System.out.println("학생이름을 입력해 주세요");
        System.out.print(">>");
        String name = sc.next();
        for(int i=0; i < slist.size();i++){//slist 는 arrayList배열이름과 입력한 이름비교
            if(slist.get(i).getName().equals(name)){
                index = i; //같은데이터가 있으면 i 를 index에 대입
                break;
            }
        }
        return index;
    }
    public void userSelect() {
        System.out.println("<학생정보보기>");
        int index = searchIndex();
        if(index == -1){
            System.out.println("찾는 학생이 없습니다.");
        }else{
            System.out.println(" 이름\t 나이\t 국어\\t 영어 \\t수학\\n" +  
            "-------------------------------------------------");
            java_1202.hak5.StudentDTO s = select(index);
           System.out.println(s);
        }
    }
    public void userUpdate() {
        System.out.println("<학생정보수정>");
        int index = searchIndex();
        if(index == -1){
            System.out.println("찾는 학생이 없습니다.");
        }else{
            java_1202.hak5.StudentDTO s = new java_1202.hak5.StudentDTO(); //빈객체를 하나 만든다.
            s.setId((slist.get(index).getId())); //기존 인덱스 번호해당 리스트에 있는 아이디
            s.setName(slist.get(index).getName());
            s.setAge(slist.get(index).getAge());
            System.out.println("<"+slist.get(index).getName()+"학생의 정보수정");
            System.out.print("국어점수 : ");
            s.setKor(sc.nextInt());
            System.out.print("영어점수 : ");
            s.setEng(sc.nextInt());
            System.out.print("수학점수 : ");
            s.setMath(sc.nextInt());
            updete(index, s);
            
            }
            
        }
    
    public void printAll() {
        System.out.println(" 이름\t 나이\t 국어\t 영어 \t수학 \n" +  
        "-------------------------------------------------");
        for(int i=0; i < slist.size();i++){
            System.out.println(slist.get(i).toString());
        }
    }
    public void dataSave() throws Exception {
        file.create();
        String str = "이름\t 나이\t 국어\\t 영어\\t 수학\n" +
                "-------------------\n";
        for(int i = 0 ;i < slist.size();i++){
            str += slist.get(i).toString()+"\n";
        }
        file.write(str);

    }


    public void dataLoad() {
        //데이터 입출력은 반드시 예외처리
        try{
            file.read();
        }catch(Exception e){
            System.out.println("읽을 파일이 없습니");
        }
    }
}
