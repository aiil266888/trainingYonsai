package java_1127.downcasting;

class Animal {
    public void move(){
        System.out.println("움직입니다");
    }
}
    class Bird extends Animal{
        public void bark(){
            System.out.println("쨲ㅉ꺠쨲쨰ㅒㄲ쨲쨲");
        }

        @Override
        public void move(){
            System.out.println("날아갑니다이");
        }
    }


    public class DownCasting1{
        public static void main(String[] args) {
           //Animal animal = new Animal();
//            Bird bird =new Bird();
//            Animal.move();
//            bird.bark();
//            bird.move();
            Animal animal = new Bird(); //업캐스팅 (자동)
            animal.move();
            //animal.bark(); 이건안됨

            //다운캐스팅
            if(animal instanceof Bird){
                Bird bird = (Bird)animal;
                System.out.println("Bird타입맞음");
                bird.bark();
            }else{
                System.out.println("Bird 타입이 아닙니다 ");
            }
        }
    }
