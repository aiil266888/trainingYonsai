package java_1121.overloading;

public class CarExample {
    public static void main(String[] args) {

        //생성자 호출1
        Car car1 = new Car();
        System.out.println("car1.company = " + car1.company);

        //생성자 호출2
        Car car2 = new Car("자가용");
        System.out.println("car2.company : " + car2.company);;
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        //생성자 호출3
        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        //생성자 호출4
        Car car4 = new Car("택시", "검정", 200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);

    }
}
