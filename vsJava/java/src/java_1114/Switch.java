package java_1114;

public class Switch {
    public static void main(String[] args) {
        double num0 = Math.random();
        int num = (int)(Math.random()*6)+1;

        //System.out.println(num0);
        System.out.println(num);
        switch(num){
            case 1:
                System.out.println("1번");
                break;
            case 2:
                System.out.println("2번");
                break;
            case 3:
                System.out.println("3번");
                break;
            case 4:
                System.out.println("4번");
                break;
            case 5:
                System.out.println("5번");
                break;
            default:
                System.out.println("6번 나왔습니다");
        }

        //랜덤함수 7~11
        for(int i = 0; i<100; i++){
            int ran = (int)(Math.random()*4)+8;
            System.out.println(ran);
        }


    }
}
