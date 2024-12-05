package java_1204;

import java.util.ArrayList;
import java.util.List;

class Student1 {
   
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
    public Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}

public class List1 {
    public static void main(String[] args) {
        //ArrayList 생성
        List<Student3> student31List = new ArrayList<>();

        //객체추가
        student31List.add(new Student3(101, "Alice", 20));
        student31List.add(new Student3(102, "Bob", 22));
        student31List.add(new Student3(103, "Charlie", 21));

        //ArrayList 내용출력
        System.out.println("Student List 출력 : ");
        for(Student3 student31 : student31List){
            System.out.println(student31);
        }

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

    }
}
