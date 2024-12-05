package java_1205.Stream1;

public class Member {
    public static int MALE = 0;
    public static int FEMAIL = 0;

    //클래스 변수는 클래스명. 변수명 바로 접근 가능
    private String name;
    private int gender;
    private int age;

    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public static int getMALE() {
        return MALE;
    }

    public static int getFEMAIL() {
        return FEMAIL;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
