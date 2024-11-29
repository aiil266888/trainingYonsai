package java_1129;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


//컬렉션 프레임 워크
//List 인터페이스
// 1. 요소의 저장순서유지
// 2. 같은 요소 중복저장 허용

//Set 인터페이스
//Map 인터페이스
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        //add메소드를 이용한 요소의 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(80);
        arrList.add(30);

        System.out.println("리스트 출력 1 : " + arrList);

        //for문과get()메소드를 이용한 요소의 출력
        for(int i = 0 ; i<arrList.size(); i++){
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
        System.out.println("foreach문과 get메소드를 이용한 요소의 출력");
        //Enhanced for문  -> foreach문과 get메[소드를 이용한 요소의 출력
        for(int e : arrList){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("Collections.sort()메소드를 이용한 요소의 정렬");
        //Collections.sort()메소드를 이용한 요소의 정렬
        Collections.sort(arrList);
        for(int e : arrList){
            System.out.print(e + " ");
        }

        //iterator() 메소드와get()메소드를 이용한 요소 출력
        //다양한 요소에 접근
        System.out.println();
        System.out.println("iterator()과 get()을 이용한 요소출력");
        Iterator<Integer> iter = arrList.iterator();
        while(iter.hasNext()){
            //다음요소가 있을때까지 순회
            System.out.print(iter.next() + " ");
            //next 현재요소반환 , 다음요소로 이동
        }

        System.out.println();
        System.out.println("set() 을 이용한 요소 변경");
        //set() 메소드를 이용한 요소의 변경
        arrList.set(0,100); //0번째를 100으로 변경
        for(int e : arrList){
            System.out.print(e + " ");
        }

        //요소의 삽입
        System.out.println();
        System.out.println("add()를 이용한 요소추가");
        arrList.add(1,50);
        for(int e : arrList){
            System.out.print(e + " ");
        }

        System.out.println();
        System.out.println("리스트의 크기 : " + arrList.size());

        System.out.println("remove를 이용한 요소 제거 ");
        arrList.remove(3);
        for(int e : arrList){
            System.out.print(e+ " ");
        }
    }
}
