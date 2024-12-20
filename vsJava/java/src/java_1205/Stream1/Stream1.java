package java_1205.Stream1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Stream1 {
    public static void main(String[] args) {

        //1. 배열을 ArrayList로 변환
        //2. 짝수만 추출
        //3. ArrayList를 HashSet으로 변환
        //4. 중복 제거
        //5. 다시 ArrayList로 변환 -> 역순으로 정렬
        //6. Integer리스트를 정수배열로 전환

        int[] data = {5,6,7,4,1,5,2,2,4,1,8,9};
        //ArrayList생성 - 짝수만 포함
        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i = 0; i< data.length; i++){
            if(data[i] % 2 == 0){
                dataList.add(data[i]);
            }
        }
        //set을 사용하여 중복 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        //set을 다시 List로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        //역순으로 정렬
        distinctList.sort(Comparator.reverseOrder());
        //순방향 Comparator.naturalOrder();

        //Integer 리스트를 정수 배열로 전환
        int[] result = new int[distinctList.size()];
        for(int i = 0; i < distinctList.size(); i++){
            result[i] = distinctList.get(i);
        }

        //확인용 출력
        for( int num : result ){
            System.out.print(num + " ");
        }

    }
}
