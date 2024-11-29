package java_1129.interface1;

interface Flyable{
    void fly();

//    이렇게쓰는건xxxxxxxxxx
//    void sleep(){
//        System.out.println("쿨쿨");
//    }
/*
*   default void sleep(){
*   Systerm.out.println();
*   }//자바8이후 default 메서드는 가능, 오버라이드도 할 수 있음
*   static void sleep(){
*    System.out.println();
*   } 오버라이드 상속 안됨
*   객체를 만들지 않고Flyable.sleep()직접 호출이 가능
* */

}

interface Swimmable{
    void swim();
}

class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println(" 새가 하늘을 난다 ");
    }
    void land(){
        System.out.println("착륙한다 ");
    }
}

class Fish implements java_1129.Swimmable {
    @Override
    public void swim() {
        System.out.println(" 물고기가 수영한다 ");
    }
}

public class interface2 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.land();
        //default메서드느 ㄴ인터페이스 구현 코드에 포함할 수 있음
        //이를 구현한 클래스는 필요에 따라 오버라이드 할 수 있음
        //주로 기존 인터페이스에 새 기능을 추가 할 때 사용
    }
}
