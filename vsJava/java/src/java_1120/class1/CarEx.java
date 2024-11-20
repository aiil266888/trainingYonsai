package java_1120.class1;

public class CarEx {
    public static void main(String[] args) {
        Car boorung1 = new Car();

        boorung1.company = "KIA";
        boorung1.model = "EV9";
        boorung1.color ="white";
        boorung1.maxSpeed = 400;
        boorung1.speed = 230;

        Car boorung2 = new Car();

        boorung2.company ="현대";
        boorung2.model ="제네시스";
        boorung2.color = "Black";
        boorung2.maxSpeed = 380;
        boorung2.speed = 100;
        System.out.println("수정전 속도 : " + boorung2.speed);
        boorung2.speed =80; //
        System.out.println("수정된 속도 : " + boorung2.speed);

        Car boorung3 = new Car("KIA","EV3","Red",220,65);

        System.out.println(boorung3.company);
        System.out.println(boorung3.model);

    }


}
