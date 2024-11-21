package java_1121.overloading;

public class Student {
    String name;
     int age;
    String stdNo;
    String major;

    //생성
    //기본 생성자
    public Student(){
        this("이름없음",1,"000000","없음");
    }

    public Student(String name,int age, String stdNo, String major){
        this.name = name;
        this. age = age;
        this.stdNo = stdNo;
        this.major = major;
    }

    public void study(String study){

    }
}
