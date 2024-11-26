package java_1126.section03;

class Parent{
    Parent(){
        System.out.println("Parent constructor");
    }
}

class Child extends Parent{
    Child(){
        super(); //자식이 부모의 생성자를 원하면 이거 적어줘야함
        System.out.println("Child constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
