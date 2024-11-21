package java_1120.class2;

public class main2 {
    public static void main(String[] args) {
        //방법1
        People p1 = new People();

        p1.name = "PARK";
        p1.age = 30;
        p1.gender = "남성";
        
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.gender);

        //방법2
        People p2 = new People ("HAN",54,"F");
        System.out.println(p2);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.gender);
    }
}
