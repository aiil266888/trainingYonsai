package SemiProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Logincheck {
    Scanner scan = new Scanner(System.in);

    private static ArrayList<UserDTO> ulist;
    private static Map<String, UserDTO> userlistMap = new HashMap<>();

    public Logincheck() {
        //더미데이터 생성메서드
        ulist = new ArrayList<>();
        //기본데이터 입력
        ulist.add(new UserDTO("minju", "minju1", "박민주", 34, "대리", "마케팅", "010-123-4567", "서울시 영등포구", 0));
        ulist.add(new UserDTO("daeju", "dddju", "김대주", 45, "부장", "마케팅", "010-123-4567", "경기도 안산시", 0));
        ulist.add(new UserDTO("jihwan", "1234", "오지환", 31, "대리", "마케팅", "010-123-4567", "경기도 안양시", 0));
        ulist.add(new UserDTO("star1", "star111", "김혜성", 25, "주임", "마케팅", "010-123-4567", "경기도 의왕시", 0));
        ulist.add(new UserDTO("Eusung", "re53", "이우성", 36, "과장", "마케팅", "010-123-4567", "서울시 관악구", 0));
        ulist.add(new UserDTO("heroKim", "young", "김영웅", 23, "사원", "마케팅", "010-123-4567", "서울시 마포구", 0));
        ulist.add(new UserDTO("mangmuri", "tack111", "김택연", 21, "사원", "마케팅", "010-123-4567", "서울시 또뭐있지", 0));
        ulist.add(new UserDTO("superstar", "do111", "김도영", 22, "사원", "마케팅", "010-123-4567", "경기도 광주시", 0));
        ulist.add(new UserDTO("monster", "ryuh111", "류현진", 36, "대리", "마케팅", "010-123-4567", "경기도 수원시", 0));
        ulist.add(new UserDTO("choi", "homerun", "최정", 37, "과장", "마케팅", "010-123-4567", "인천 지리모름", 0));
        ulist.add(new UserDTO("kimsh", "seohyun", "김서현", 24, "사원", "마케팅", "010-123-4567", "경기도 의정부시", 0));
        ulist.add(new UserDTO("jungsb", "subin", "정수빈", 30, "대리", "마케팅", "010-123-4567", "경기도 관악구", 0));
        ulist.add(new UserDTO("nasungb", "bumbum", "나성범", 31, "대리", "마케팅", "010-123-4567", "서울시 영등포구", 0));
        ulist.add(new UserDTO("sonasobi", "oppamuzina", "손아섭", 41, "부장", "마케팅", "010-123-4567", "경기도 성남시", 0));
        ulist.add(new UserDTO("choiwon", "wonjun1", "최원준", 28, "주임", "마케팅", "010-123-4567", "경기도 부천시", 0));
        ulist.add(new UserDTO("wonjungkim", "wonwonwon", "김원중", 30, "주임", "마케팅", "010-123-4567", "서울시 동작구", 0));
        ulist.add(new UserDTO("sangsu", "susu", "김상수", 34, "대리", "마케팅", "010-123-4567", "서울시 도봉구", 0));
        ulist.add(new UserDTO("huckpark", "sinra", "박혁거세", 56, "부장", "마케팅", "010-123-4567", "경기도 수원시", 0));
        ulist.add(new UserDTO("cheonsung", "chs123", "천성호", 27, "주임", "마케팅", "010-123-4567", "경기도 광주시", 0));
        ulist.add(new UserDTO("huihui", "nckimhui", "김휘집", 29, "주임", "마케팅", "010-123-4567", "경기도 안양시", 0));
        ulist.add(new UserDTO("admin", "1234", "관리자", 00, "관리자", "관리자", "000-000-0000", "관리자", 1));
    }

    public void checkLogin(String Id, String Pw) {
        boolean result = false;
        ArrayList<UserDTO> LoginInfo;
        if(ulist != null){
            for (int i=0; i < ulist.size(); i++){
                if(ulist.get(i).getId().equals(Id)){
                    if(ulist.get(i).getPw().equals(Pw)){
                        result = true;
                        System.out.println("로그인성공! 어서오세요 " + ulist.get(i).getName() + " 님");
                        break;
                    }
                }
            }//END for
            if(!result){ //정보불일치
                System.out.println("ID 혹은 비밀번호를 확인해주세요");
                System.exit(0);
            }
        }
    }//END  checkLogin

}//END class
