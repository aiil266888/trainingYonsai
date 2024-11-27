package java_1127.downcasting;

public class DowncastingEX {
    public static void main(String[] args) {
        Parent parentRef = new Child(); //UpCasting
        parentRef.show(); //자식클래스 메서드(다형성 / 자식객체를 부모타입으로 변환)

        //다운캐스팅
        if(parentRef instanceof Child){ //자식타입이 Child타입이 맞으면
            Child childRef = (Child)parentRef; //명시적 형변환
            System.out.println("다운캐스팅 성공 (childRef.childspecial()실행)");
            childRef.childspecial();
        }else{
            System.out.println("다운캐스팅 실패");
        }
    }
}


class Parent{
    void show(){
        System.out.println("부모클래스 메서드");
    }
}

class Child extends Parent {
    @Override
    void show(){
        System.out.println("자식클래스 메서드");
    }
    void  childspecial(){
        System.out.println("자식 특별클래스 메서드");
        super.show();
    }
}
