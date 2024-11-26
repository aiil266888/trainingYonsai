package java_1126.section02;

public class SmartPhone extends Phone {
    //필드 선언
    public boolean wifi;

    public void setWifi(boolean wifi){
        this.wifi =  wifi;
        System.out.println("와이파이 연결 상태를 변경합니다");
    }
    public void internet(){
        System.out.println("인터넷을 연결합니다");
    }


    //생성자 선언
    public SmartPhone(String model, String color){
        this.model = model;
        this.color = color;
    }
    //메소드

}
