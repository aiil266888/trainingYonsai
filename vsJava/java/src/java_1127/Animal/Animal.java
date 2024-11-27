package java_1127.Animal;

//추상 클래스 정의
abstract class Animal {
    //사용할 변수 (이름, 나이)
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //공통속성 추상메서드로 정의 Sound / move 내용은 자식메서드에 씀
    abstract void sound();
    abstract void move();

    //공통정보 출력
    public void info(){
        System.out.println(this.getClass().getSimpleName()+" : "+ name + "/" + age);
    }

}

class Dog extends Animal{
    public Dog(String name, int age) {
        super(name,age);
    }

    @Override
    public void sound() {
        System.out.println( name + "(이)가 짖는다 멍ㅇ멍ㅁ어멍ㅇ멈엉멍멍");
    }

    @Override
    public void move() {
        System.out.println(name + "(이)가 네 발로 걷는다 벌써 "+ age+"살 이다 ");
    }
}

class Bird extends Animal{
    public Bird(String name, int age) {
        super(name,age);
    }

    @Override
    public void sound() {
        System.out.println(name+ "이(가) 울부짖었다 쨰쨰ㅉㄹㅉ쨰꺠ㅉㄲ쨲쨰쨰쨲");
    }

    @Override
    public void move() {
        System.out.println(age+"살인데도 잘 날아다닌다");
    }
}

class Fish extends Animal{
    public Fish(String name, int age) {
        super(name,age);
    }

    @Override
    public void sound() {
        System.out.println(name + "은(는) 말을못한다 ......................");
    }

    @Override
    public void move() {
        System.out.println(age+ "살이라도 건강하게 헤엄친다");
    }
}
