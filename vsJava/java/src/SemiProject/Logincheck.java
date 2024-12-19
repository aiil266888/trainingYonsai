package SemiProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Logincheck {
    static Scanner scan = new Scanner(System.in);

    private static ArrayList<UserDTO> ulist;
    public Logincheck() {
        //더미데이터 생성메서드
        ulist = new ArrayList<UserDTO>();
        //기본데이터 입력
        ulist.add(new UserDTO("minju", "minju1", "박민주", 34, "대리", "마케팅", "010-123-4567", "서울시 용산구", 0));
        ulist.add(new UserDTO("daeju", "dddju", "김대주", 45, "부장", "마케팅", "010-123-4567", "경기도 안산시", 0));
        ulist.add(new UserDTO("jihwan", "1234", "오지환", 31, "대리", "마케팅", "010-123-4567", "경기도 안양시", 0));
        ulist.add(new UserDTO("star1", "star111", "김혜성", 25, "주임", "마케팅", "010-123-4567", "경기도 의왕시", 0));
        ulist.add(new UserDTO("Eusung", "re53", "이우성", 36, "과장", "마케팅", "010-123-4567", "서울시 관악구", 0));
        ulist.add(new UserDTO("heroKim", "young", "김영웅", 23, "사원", "마케팅", "010-123-4567", "서울시 마포구", 0));
        ulist.add(new UserDTO("mangmuri", "tack111", "김택연", 21, "사원", "마케팅", "010-123-4567", "서울시 뭐있지", 0));
        ulist.add(new UserDTO("superstar", "do111", "김도영", 22, "사원", "마케팅", "010-123-4567", "경기도 광주시", 0));
        ulist.add(new UserDTO("monster", "ryuh111", "류현진", 36, "대리", "마케팅", "010-123-4567", "경기도 수원시", 0));
        ulist.add(new UserDTO("choi", "homerun", "최정민", 37, "과장", "마케팅", "010-123-4567", "인천시 몰라구", 0));
        ulist.add(new UserDTO("kimsh", "seohyun", "김서현", 24, "사원", "마케팅", "010-123-4567", "경기도 의정부", 0));
        ulist.add(new UserDTO("jungsb", "subin", "정수빈", 30, "대리", "마케팅", "010-123-4567", "경기도 관악구", 0));
        ulist.add(new UserDTO("nasungb", "bumbum", "나성범", 31, "대리", "마케팅", "010-123-4567", "서울시 영등포", 0));
        ulist.add(new UserDTO("sonasobi", "oppamuzina", "손아섭", 41, "부장", "마케팅", "010-123-4567", "경기도 성남시", 0));
        ulist.add(new UserDTO("choiwon", "wonjun1", "최원준", 28, "주임", "마케팅", "010-123-4567", "경기도 부천시", 0));
        ulist.add(new UserDTO("wonjungkim", "wonwonwon", "김원중", 30, "주임", "마케팅", "010-123-4567", "서울시 동작구", 0));
        ulist.add(new UserDTO("sangsu", "susu", "김상수", 34, "대리", "마케팅", "010-123-4567", "서울시 도봉구", 0));
        ulist.add(new UserDTO("huckpark", "sinra", "박혁세", 56, "부장", "마케팅", "010-123-4567", "경기도 수원시", 0));
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

    //----------------------------------관리자용 메뉴----------------------------------------//
    //----직원추가
        public void insertEmployee() {
            UserDTO d= new UserDTO();
            System.out.println("========================직원추가==========================");
            System.out.print(" ID : ");
            d.setId(scan.next());
            System.out.print(" PW : ");
            d.setPw(scan.next());
            System.out.print(" 이름 : ");
            d.setName(scan.next());
            System.out.print(" 나이 : ");
            d.setAge(scan.nextInt());
            System.out.print(" 직급 : ");
            d.setGrade(scan.next());
            System.out.print(" 부서 : ");
            d.setDepartment(scan.next());
            System.out.print(" 연락처 : ");
            d.setPhone(scan.next());
            System.out.print(" 주소 : ");
            d.setAddress(scan.next());
            d.setAdminflag(0);

            System.out.println("등록하신 정보는 아래와 같습니다 정말 등록하시겠습니까?");
            System.out.println(d);
            System.out.println("등록하시려면 y를 입력해주세요 >> ");
            String check = scan.next();
            if(check.equals("y")){
                insert(d);
                System.out.println("등록 되었습니다");
            }else{
                System.out.println("등록이 취소되었습니다");
            }
        }
    //----직원추가실행
    private void insert(UserDTO d) {
        ulist.add(d);
    }

    //---관리자용 직원조회
    public static void serchEmployee() {
        System.out.println("========================사원명단===========================");
        int count =1;
        for(int i=0; i < ulist.size(); i++){
            if(ulist.get(i).getId()=="admin"){//관리자 정보 출력 방지
                return;
            }else {
                System.out.print(" ID : ");
                System.out.print(ulist.get(i).getId() + " | ");
                System.out.print(" PW : ");
                System.out.print(ulist.get(i).getPw() + " | ");
                System.out.print(" 이름 : ");
                System.out.print(ulist.get(i).getName() + " | ");
                System.out.print(" 나이 : ");
                System.out.print(ulist.get(i).getAge() + " | ");
                System.out.print(" 직급 : ");
                System.out.print(ulist.get(i).getGrade() + " | ");
                System.out.print(" 부서 : ");
                System.out.print(ulist.get(i).getDepartment() + " | ");
                System.out.print(" 연락처 : ");
                System.out.print(ulist.get(i).getPhone() + " | ");
                System.out.print(" 주소 : ");
                System.out.print(ulist.get(i).getAddress() + " | ");
                count++;
                System.out.println();
            }
        }
        System.out.println("==========================================================");
    }
    //---관리자용 직원정보 수정
    public static void modifyEmployee() {
    }
    //----직원삭제
    public static void deleteEmployee() {
    }




    //----------------------------------일반유저용 메뉴--------------------------------------//
    public static void AbstractMenu(){

    }
    //사원목록 조회
    protected static void surchingList(String Id) {
        System.out.println("========================사원명단===========================");
        int count =1;
        for(int i=0; i < ulist.size(); i++){
            if(ulist.get(i).getId()=="admin"){//관리자 정보 출력 방지
                return;
            }else {
                System.out.print(" 이름 : ");
                System.out.print(ulist.get(i).getName() + " | ");
                System.out.print(" 나이 : ");
                System.out.print(ulist.get(i).getAge() + " | ");
                System.out.print(" 직급 : ");
                System.out.print(ulist.get(i).getGrade() + " | ");
                System.out.print(" 부서 : ");
                System.out.print(ulist.get(i).getDepartment() + " | ");
                System.out.print(" 연락처 : ");
                System.out.print(ulist.get(i).getPhone() + " | ");
                System.out.print(" 주소 : ");
                System.out.print(ulist.get(i).getAddress() + " | ");
                count++;
                System.out.println();
            }
        }
        System.out.println("==========================================================");
    }

    //사원정보 변경
    protected static void modifyInformation(String Id){

    }

}//END class

