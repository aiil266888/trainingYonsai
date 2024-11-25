package java_1125.Person1;

public class Person {

    //정적변수 (static변수) - 클래스변수
    //정적변수는 클래스에 속하고 객체를 생ㅅ어하지 않고
    //클래스 이름으로 직접  접근 할 수 있는 변수 중 하나
    //전체 사람 수를 저장하는 정적변수
    private static int count;
    private String name;
    private int age;

    //정적 메서드
    //정적 메서드는 클래스에 속하며 객체를 생성하지 않고도
    //클래스 이름으로 직접접근 할 수 있는 메소드는 인스턴스 변수에
    //접근할 수 없으며 오직 정적변수나 다른 정적 메서드만 호출 할 수 있다
    public static int getTotalCount(){
        return count;
    }
    public static int getCount(){
        return count;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++; //새로운 사람이 생성될때마다 총 인원수 증가
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
