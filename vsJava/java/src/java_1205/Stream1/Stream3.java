package java_1205.Stream1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(2);
        list.add(6);
        list.add(8);

        //컬렉션에서 스트림 생성
        Stream<Integer> stream = list.stream();
        //forEach메소드를 이용한 출력
        stream.forEach(System.out::println);
    }
}
