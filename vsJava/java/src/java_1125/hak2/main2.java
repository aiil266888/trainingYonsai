package java_1125.hak2;

public class main2 {
    public static void main(String[] args) {
        //학생 객체 생성
        Student student1 = new Student("홍길동",  20231234, 90,85,92);

        //학생정보 출력
        System.out.println("이름 : " + student1.getName());
        System.out.println("학번 : " + student1.getStudentId());
        System.out.println("국어 : " + student1.getKor());
        System.out.println("수학 : " + student1.getMath());
        System.out.println("영어 : " + student1.getEng());
        System.out.println("평균 : " + student1.getAverage());


        //2번방법 (위에서 직접만든 생성자가 있으면 자바가 자동으로 생성자를 만들지 않음
        //그래서 기본 생성자를 만들어야함 public Student(){} <<<<이거
        Student student2 = new Student();
    }
}
