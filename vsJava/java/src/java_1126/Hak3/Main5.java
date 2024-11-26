package java_1126.Hak3;


//모든 자바 클래스는 Object라는 클래스를 상속한다 보통은 생략함
public class Main5 extends Object {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 25);
        //toString()는 Object에서 상속받은 메서드, 객체의 문자열 표현을 정의하는 메서드
        //객체 person -> person.toString()생략된 형태
        System.out.println(person.toString()); //이걸
        System.out.println(person);//이렇게써도 같음

        //getter setter가 없어서 출력할 방법없는상태
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter setter없으면 아래처럼 귀찮게 써야하는데!!!
//    public String toStr(){
//        return String.format("이름: %s, 나이: %d",name,age);
//    }

    //무려!! toString Override해주면!!!!!아래처럼!!((Generate -> toString()메서드 사용하면 자동완성)))
    //원래는 주소만 표기해주는데 이렇게 오버라이드해주면 상속받은 객체 안에 있는 필드(문자열)도 표현가능
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}


