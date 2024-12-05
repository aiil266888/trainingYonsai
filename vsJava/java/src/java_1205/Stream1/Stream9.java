package java_1205.Stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream9 {
    public static void main(String[] args) {
        List<Member> list = (List) Arrays.asList(
                new Member("가나다", Member.MALE,45),
                new Member("라마바", Member.FEMAIL,27),
                new Member("사아다", Member.FEMAIL,67),
                new Member("카타파", Member.MALE,84));

        List<Member> list2 = new ArrayList<>();
        Member m1 = new Member("김김김", Member.FEMAIL, 23);
        Member m2 = new Member("박박박", Member.MALE, 33);
        Member m3 = new Member("정정정", Member.FEMAIL, 45);
        Member m4 = new Member("이이이", Member.MALE, 57);

        //1. 외부 반복자
        int count = 0;
        double sum = 0;
        for(int i = 0; i< list.size(); i++){
            if(list.get(i).getGender() == Member.MALE){
                sum = sum + list.get(i).getAge();
                count++;
            }
        }
        double ageAvg1 =sum/count;
        System.out.println("남성 평균 나이 : " + ageAvg1);
    }
}
