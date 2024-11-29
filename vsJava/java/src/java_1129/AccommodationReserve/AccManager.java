package java_1129.AccommodationReserve;

import java.util.ArrayList;
import java.util.Scanner;

//숙소를 관리
public class AccManager {
    private ArrayList<java_1129.AccommodationReserve.Accommodation> accommodations; //숙소집합
    private ArrayList<java_1129.AccommodationReserve.Accommodation> bookedAccommodations; //예약한숙소

    public AccManager() {
        accommodations = new ArrayList<>(); //초기숙소를 저장할 리스트
        bookedAccommodations = new ArrayList<>();
        //초기숙소 추가
        accommodations.add(new java_1129.AccommodationReserve.Accommodation("호텔A", "서울", 100.0));
        accommodations.add(new java_1129.AccommodationReserve.Accommodation("호텔B", "부산", 80.0));
        accommodations.add(new java_1129.AccommodationReserve.Accommodation("호텔C", "제주", 120.0));

    }

    public void disAvailAccommodations() {
        System.out.println("예약가능 숙소보기");
        for (java_1129.AccommodationReserve.Accommodation accommodation : accommodations) {
            if (accommodation.isAvailable()) {
                System.out.println(accommodation);
            }
        }

    }

    public boolean bookedAccommodations(String name) {
        for (java_1129.AccommodationReserve.Accommodation accommodation : accommodations) {
            if (accommodation.getName().equalsIgnoreCase(name) && accommodation.isAvailable()) {
                accommodation.book(); //isAvailable 에 false를 넣는 메소드
                bookedAccommodations.add(accommodation); //예약숙소 arraylist추가
                return true;
            }
        }
        return false;
    }

    public void disBookedAccommodations() {
        System.out.println("예약한 숙소: ");
        for (java_1129.AccommodationReserve.Accommodation accommodation : bookedAccommodations) {
            System.out.println(accommodation);
        }
    }

    public void addAccommodation(String newName, String newLocation, Double newPrice) {
        accommodations.add(new java_1129.AccommodationReserve.Accommodation(newName, newLocation, newPrice));
    }

    public void deleteAccommodation(String dname) {
        boolean result = false;
        for (java_1129.AccommodationReserve.Accommodation accommodation : accommodations) {
            if (accommodation.getName().equalsIgnoreCase(dname)) {
                if (accommodation.isAvailable()) {
                    accommodations.remove(accommodation);
                    result = true;
                    break;
                } else { //숙소가 예약중이면 삭제 불가
                    result = false;
                    break;
                }
            }
        }
        if (result) {
            System.out.println("삭제됨");
        } else {
            System.out.println("삭제 안됨");
        }

    }


    public void updateAccommodation(String uname) {
        int i = 0;
        int index = -1;
        int menu = -1;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Accommodation newA = new Accommodation();
        System.out.println(uname);

        for (Accommodation a : accommodations) {
            i++;
            if (a.getName().equals(uname)) {
                index = i - 1;
                newA = a;
            }
            System.out.println(a.getName().equals(uname) + "=   " + a.getName() + " " + uname);
        }
        if (index != -1) { //수정 할 호텔 이름이 존재할경우
            System.out.print("무엇을 수정하시겠습니까 ? \n 1.숙박업소 이름 \t 2. 지역 \t 3. 가격 \n >>");
            menu = sc.nextInt();
            sc.nextLine();
            while (flag) {
                switch (menu) {
                    case 1:
                        System.out.println("수정할 이름");
                        newA.setName(sc.nextLine());
                        accommodations.set(index, newA);
                        break;
                    case 2:
                        System.out.println("수정할 위치");
                        newA.setName(sc.nextLine()); //위치가 수정된 객체
                        accommodations.set(index, newA); //리스트의 값을 수정
                        break;
                    case 3:
                        System.out.println("수정할 가격");
                        newA.setName(sc.nextLine());
                        accommodations.set(index, newA);
                        flag = false;
                        break;
                    default:
                        System.out.println("1~3번 중 입력하세요 ");
                        break;
                }
            }
        } else {
            System.out.println("찾으시는 숙소가 존재하지 않습니다");
        }

    }


    public void showAccommodation(String sname) {
        for (Accommodation a : accommodations) {
            if (a.getName().equalsIgnoreCase(sname)) {
                System.out.println(a.toString());
            }
        }
    }
}