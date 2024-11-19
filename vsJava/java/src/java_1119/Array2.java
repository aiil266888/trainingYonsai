package java_1119;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        String[] week ={"월요일","화요일","수요일","목요일","금요일","토요일","일요일",};

        for(int i = 0; i <week.length ; i++) {
            System.out.print(week[i]+" ");
        }

        System.out.println();
        System.out.println(Arrays.toString(week));
        System.out.println();

        ///foreach
        for(String day : week){
            System.out.print(day + " ");
        }
    }
}
