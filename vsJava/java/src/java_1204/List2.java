package java_1204;

import java.util.ArrayList;
import java.util.List;

class Student3 {
   
    private int id;
    private String name;
    private int age;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Student3(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}

public class List2 {
    public static void main(String[] args) {
        //ArrayList 생성
        List<Student3> student31List = new ArrayList<>();

        //객체추가
        student31List.add(new Student3(101, "Alice", 20));
        student31List.add(new Student3(102, "Bob", 22));
        student31List.add(new Student3(103, "Charlie", 21));

        //ArrayList 내용출력
        System.out.println("Student List 출력 : ");
        printList(student31List);

        //특정인덱스의 객체 가져오기
        System.out.println("\n특정 인텍스(1)의 Student 정보");
        Student3 student31 = student31List.get(1); //인덱스 1번객체
        //String name = studentList.get(1).getName(); 이름
        System.out.println(student31);

        //모든 student 이름만 출력
        System.out.println("\n모든 학생의 이름 출력");
        for(Student3 s : student31List){
            System.out.println(s.getName());
        }

        //데이터추가 
        //104, "David", 23
        System.out.println("\n새로운 학생 추가");
        student31List.add(new Student3(104, "David", 23));
        printList(student31List);
        
        //데이터 변경
        System.out.println("\n특정 학생 변경");
        updateStudent(student31List, 102 ,"Robert", 25);
        printList(student31List);
        //데이터 삭제
        System.out.println("\n특정 학생 삭제");
        deleteStudent(student31List, 103);
        printList(student31List);
        //특정 학생 검색
        System.out.println("\n 특정 학생 검색");
        Student3 searchedStudent31 = findStudentById(student31List, 104);
        System.out.println(searchedStudent31 != null ? searchedStudent31 :"학생을 찾을 수 없습니다." );
        
                
    }
                             
                           
                
                  
        
        
        
            //ArrayList 출력 메서드
    private static void printList(List<Student3> student31List) {
        for(Student3 student31 : student31List){
            System.out.println(student31);
        }
    }
    //학생정보 업데이트
    private static void updateStudent(List<Student3> student31List, int id, String newName, int newAge) {
        //리스트를 돌면서 id가 같은 것을 찾아서 이름 과 나이를 변경해보세요 
        for(Student3 student31 : student31List){
            if(student31.getId() == id ){ //studentList 중 매개변수 입력된 102 같으면
                student31.setName(newName); //Robert
                student31.setAge(newAge); //25
                System.out.println("학생 ID "+ id + "정보가 수정되었습니다.");
                return;
            }
        }
        System.out.println("학생 ID" + id +"을(를) 찾을 수 없습니다.");
    }
    private static void deleteStudent(List<Student3> student31List, int id) {
        for(int i = 0; i < student31List.size(); i++){
            if(student31List.get(i).getId() == id){
                student31List.remove(i);
                System.out.println("학생 ID "+ id + "정보가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("학생 ID" + id +"을(를) 찾을 수 없습니다.");
    }
    private static Student3 findStudentById(List<Student3> student31List, int id) {
        for(Student3 student31 : student31List){
            if(student31.getId() == id ){ //studentList 중 매개변수 입력된 102 같으면
                return student31;
            }
        }
        return null;
    }

}
