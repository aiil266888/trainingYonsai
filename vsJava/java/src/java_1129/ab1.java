package java_1129;

abstract class Animal{
    int a = 10;
    //추상클래스는 추상 메소드를 포함하고 있다는 점을 제외하면 일반 클래스와 동일하다
    //즉 생성자, 필드 , 일반 메소드를 포함 가능하다
    abstract void cry();
}

class Cat extends Animal{

    @Override
    void cry() {
        System.out.println("나묭나묭");
    }
}

class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("왈왕ㅇㄹ왈오아ㅗㅇ롸와아ㅗㄹ아왉");
    }
}


public class ab1 {
    public static void main(String[] args) {
        //Animal a = new Animal(); <<<<<<<추상클래스는 인스턴스(객체생성 금지)

        Cat c = new Cat();
        Dog d = new Dog();
        c.cry();
        d.cry();

        //자식을 부모타입으로 업캐스팅 후 호출
        Animal ca = new Cat();
        Animal dg = new Dog();
        ca.cry();
        dg.cry();
    }
}
