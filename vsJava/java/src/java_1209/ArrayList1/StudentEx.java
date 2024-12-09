package java_1209.ArrayList1;

import java_1205.Hospital.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();
        //더미데이터 추가

//------------------방법1 ------------------------------
//        Student s1 = new Student("Alice", "S001",20);
//        Student s2 = new Student("Bob", "S002",32);
//        Student s3 = new Student("Charile", "S003",22);
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);


//------------------방법2 ------------------------------
        students.add(new Student("Alice", "S001",20));
        students.add(new Student("Bob", "S002",32));
        students.add(new Student("Charile", "S003",22));

        Student s4 = new Student();
        s4.setName("tom");
        s4.setAge(22);
        s4.setStudentId("S004");
        students.add(s4);
        boolean run = true;
        boolean found;

        Scanner scanner = new Scanner(System.in);
        int select;
        while(true){
            System.out.println("---------학생 관리 프로그램------------");
            System.out.println("1. 학생추가");
            System.out.println("2. 학생들 리스트 보기");
            System.out.println("3. 학생수정");
            System.out.println("4. 학생삭제");
            System.out.println("5. EXIT");
            System.out.print("번호를 입력 >>");
            select = Integer.parseInt(scanner.next());
            System.out.println();

            if(select == 1){
                //학생을 입력받아 넣고 리스트에 추가하는 내용을 작성하세요

                System.out.print("이름을 입력하세요 :");
                String name = scanner.next();
                System.out.println();
                System.out.print("아이디를 입력하세요 :");
                String id = scanner.next();
                System.out.println();
                System.out.print("나이를 입력하세요 :");
                int age = scanner.nextInt();
                System.out.println();
                students.add(new Student(name,id,age));

                System.out.println("등록이 완료되었습니다");
            }else if (select == 2){
                //학생 리스트 보여주기
                if(students.isEmpty()){//학생리스트가 없으면
                    System.out.println("등록된 학생이 없습니다");
                }else{
                    for(Student student: students){
                        System.out.println(student);
                    }
                }
                break;
            }else if (select == 3){
                System.out.println("수정 할 학생 id를 입력해주세요");
                String updateId = scanner.next();
                found = false;
                for(Student student:  students) {
                    if (Student.getStudentId().equalsIgnoreCase(updateId)) {
                        System.out.print("새로운 이름 :");
                        student.setName(scanner.nextLine());
                        System.out.print("새로운 나이 :");
                        student.setAge(scanner.nextInt());
                        scanner.nextLine(); //Consume newline
                        System.out.println("학생 수정 성공");
                        found = true;
                        break;
                    }
                    if (!found) {
                        System.out.println("찾는 학생이 없습니다");
                    }
                }
            }else if (select == 4){
                    System.out.println("삭제 할 학생의 Id를 입력해주세요");
                    String deleteId = scanner.nextLine();
                    found = false;
                    for(Student student: students){
                        if(student.getStudentId().equalsIgnoreCase(deleteId)){
                            students.remove(student); //리스트에서 학생 한 줄 삭제
                            System.out.println("학생을 삭제했습니다");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("찾는 학생이 없습니다");
                    }
            }else{
                System.out.println("프로그램을 종료합니다");
                scanner.close();
                //return; //<<< 현재 메서드 main 전체를 종료, 호출 된 곳으로 제어를 반환
                run = false;
                break;
            }


        }

    }
}
