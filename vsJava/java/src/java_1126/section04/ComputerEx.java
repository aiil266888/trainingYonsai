package java_1126.section04;

public class ComputerEx {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        //얘는 calculator의 areaCircle 수제로 선언한거 사용
        System.out.println("원면적 : " + calculator.areaCircle(r));
        Computer computer = new Computer();
        //얘는 computer의 areaCircle 자바에서 지원하는 PI함수쓴거 오버라이딩한거
        System.out.println("원면적 : " + computer.areaCircle(r));
    }
}
