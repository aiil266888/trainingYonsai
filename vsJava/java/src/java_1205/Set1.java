package java_1205;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//자바 컬렉션
//다수의 데이터를 쉽고 효과적으로 처리
//List 인터페이스
//Map
//Set
public class Set1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        //데이터 삽입
        set.add("apple");
        set.add("banana");
        set.add("papaya");
        set.add("kiwi");
        System.out.println();
        for(String a : set){
            System.out.println(a);
        }
        //데이터 삭제
        set.remove("apple");

        //중복요소는 저장 안됨
        set.add("orange");
        set.add("orange");
        for(String a : set){
            System.out.println(a);
        }

        Iterator<String> iterSet = set.iterator();
        while(iterSet.hasNext()){
            System.out.println(iterSet.next() + " ");
        }

        System.out.println();
        System.out.println(set);
        System.out.println(set.contains("orange"));
        //전체 데이터 삭제
        set.clear();
        System.out.println(set);
    }
}
