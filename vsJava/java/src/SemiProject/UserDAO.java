package SemiProject;

import java_1202.hak5.StudentDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDAO {
    private ArrayList<UserDTO> ulist;

    Scanner scan = new Scanner(System.in);
    public UserDAO(){ //생성메서드
        //기본데이터 입력
        UserDTO u1 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","서울시 영등포구",0);
        UserDTO u2 = new UserDTO("daeju","dddju","김대주", 45, "부장","마케팅","010-123-4567","경기도 안산시",0);
        UserDTO u3 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 안양시",0);
        UserDTO u4 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 의왕시",0);
        UserDTO u5 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","서울시 관악구",0);
        UserDTO u6 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","서울시 마포구",0);
        UserDTO u7 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","서울시 또뭐있지",0);
        UserDTO u8 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 광주시",0);
        UserDTO u9 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 수원시",0);
        UserDTO u10 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","인천 지리모름",0);
        UserDTO u11 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 의정부시",0);
        UserDTO u12 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 관악구",0);
        UserDTO u13 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","서울시 영등포구",0);
        UserDTO u14 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 성남시",0);
        UserDTO u15 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 부천시",0);
        UserDTO u16 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","서울시 동작구",0);
        UserDTO u17 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","서울시 도봉구",0);
        UserDTO u18 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 수원시",0);
        UserDTO u19 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 광주시",0);
        UserDTO u20 = new UserDTO("minju","minju1","박민주", 34, "부장","마케팅","010-123-4567","경기도 안양시",0);
        UserDTO ad1 = new UserDTO("admin","1234","관리자",00,"관리자","관리자","000-000-0000","관리자",1);
    }

}
