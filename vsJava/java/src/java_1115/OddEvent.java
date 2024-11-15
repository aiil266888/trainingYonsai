package java_1115;

public class OddEvent {
    public static void main(String[] args) {
        int a = 1;
        int h = 0;
        int j = 0;
        for(int i = 1; i<=20; i++){
            if(i%2!=0){
                h += i;
            }else{
                j += i;
            }
        }

        System.out.println("for ver 홀수의 합계 : " + h);
        System.out.println("for ver 짝수의 합계 : " + j);

        int while_h = 0;
        int while_j = 0;
        //while문 방법
        while(a<=20){
            //홀수
                if(a%2 == 1){
                    while_h += a;
                }
                if(a%2 == 0){
                    while_j += a;
                }
                a++;
            //짝수
        }
        System.out.println("while ver 홀수의 합계 : " + while_h);
        System.out.println("while ver 짝수의 합계 : " + while_j);
    }
}
