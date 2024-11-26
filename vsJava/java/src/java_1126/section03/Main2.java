package java_1126.section03;

class Parent2{
    int x = 10;
    void show(){
        System.out.println("Parent show () ");
    }
}

class Child2 extends Parent2{
    int x = 20;
    void display(){
        System.out.println(" X in child : " + x); //자식클래스의 X
        System.out.println(" X in parent : " + super.x);//부모클래스의 X
        super.show(); //부모클래스의 show() 메소드 호출
    }
}

public class Main2 {
    public static void main(String[] args) {
        Child2 child = new Child2();
        child.display();
    }
}
//super()는 자식클래스의 생성자에서 부모 클래스의 생성자를 호출
//부모 클래스의 기본 생성자가 없으면 자식 클래스에서 super() 사용해서
//부모 클래스의 매개 변수를 받는 생성자를 명시적으로 호출한다
