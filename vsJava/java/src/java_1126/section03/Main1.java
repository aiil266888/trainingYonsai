package java_1126.section03;

class Parent1{
    Parent1(String name){
        System.out.println("Parent1 constructor" + name);
    }
}

class Child1 extends Parent1{
    Child1(){
        super("Jhone"); //자식이 부모의 생성자를 원하면 이거 적어줘야함
        System.out.println("Child1 constructor");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
