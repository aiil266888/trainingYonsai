package java_1129.interface1;


interface Animal{
    public abstract void cry();
    //추상메소드만 사용
}
class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("냐야아아ㅏ아ㅓㄹ아어리ㅏㄴ어아ㅓ아ㅣ");
    }
}

class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("아를르으를르르르르를ㄹㄹ르륽");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        c.cry();
        d.cry();

        Animal ca = new Cat();
        Animal dg = new Dog();
        ca.cry();
        dg.cry();
    }
}
