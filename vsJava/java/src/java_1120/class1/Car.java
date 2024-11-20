package java_1120.class1;

public class Car {
    //필드선언
    String company;
    String model;
    String color;
    int maxSpeed = 350;
    int speed;

    public Car(){};
//    public Car(String company, String model, String color, int maxSpeed, int speed){
//        this.company = company;
//        this.model = model;
//        this.color = color;
//        this.maxSpeed = maxSpeed;
//        this.speed = speed;
//    };
///////////위도되고 아래도되고
    public Car(String c, String m,String co, int max, int sp){
        company = c;
        model = m;
        color =co;
        maxSpeed = max;
        speed = sp;
    }
}
