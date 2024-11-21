package java_1121.overloading;

public class StudentEx {
    public static void main(String[] args) {
        //Student 객체 생성
        Student student = new Student();
//        student.name = "유영수";
//        student.age= 31;
//        student.stdNo = "2378975";
//        student.major = "컴퓨터시스템공학과";
        //값없으면 Student.java의 기본값으로 출력

        int [] score = {10,20,30,40,50};

        System.out.println("---------학생----------");
        System.out.println("학생1 - 이름 : "+student.name);
        System.out.println("학생1 - 나이 : "+student.age);
        System.out.println("학생1 - 학번 : "+student.stdNo);
        System.out.println("학생1 - 전공 : "+student.major);
        student.study("java");
    }

    public void study (String subject){
        //리턴될게 있으면 리턴타입을 써줌 없으면 걍 void
        //리턴 타입이 void면 return 생략가능
        System.out.println(subject + "(을/를) 공부합니다." );

    }
}
