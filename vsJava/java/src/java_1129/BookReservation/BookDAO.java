package java_1129.BookReservation;

import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.Files.delete;

public class BookDAO {
    Scanner sc = new Scanner(System.in);
    private ArrayList<BookDTO> booklist;

    public BookDAO(){//생성 메서드
        booklist = new ArrayList<BookDTO>();
        BookDTO  b1 = new BookDTO(1, "Java Programming", "Author A", 2020);
        BookDTO  b2 = new BookDTO(2, "Python Basics", "Author B", 2019);
        BookDTO  b3 = new BookDTO(3, "Data Structures", "Author C", 2018);

        booklist.add(b1);
        booklist.add(b2);
        booklist.add(b3);
    }

    //1. 도서목록 조회
    public void printAll() {
        System.out.println("  책 번호 \t          제목           \t      저자       \t  출간일");
        System.out.println("--------------------------");
        for (int i = 0; i <booklist.size() ; i++) {
            System.out.println(booklist.get(i).toString());
        }
    }
    //2. 신규도서 추가
    public void insertNew() {
        BookDTO new_book = new BookDTO();
        new_book.setId(booklist.size()+1);
        System.out.println(" <<<<신규도서 추가 >>>>>");
        System.out.print("제목 : ");
        new_book.setTitle(sc.next());
        System.out.print("저자 : ");
        new_book.setAuthor(sc.next());
        System.out.print("출판연도 : ");
        new_book.setYear(sc.nextInt());

        insert(new_book);
        System.out.println("신규 도서가 추가되었습니다");
    }
    private void insert(BookDTO new_book){
        booklist.add(new_book);
    }

    //3. 도서 삭제
    public void removeBook() {
        System.out.println("<<<<기존도서 삭제>>>>>");
        int index = searchIndex();
        if(index == -1){
            System.out.println("찾는 도서가 없습니다");
        }else{//-1이아니면 index에 해당 도서이름과 같은 배열번호가 들어있음
            String name = booklist.get(index).getTitle();
            delete(index);//도서 삭제메소드 실행
            System.out.println(name + "도서를 삭제했습니다");
        }
    }
    private void delete(int index) {
        //remove - ArrayList에서 리스트 한 줄 삭제 (인덱스 번호)
        booklist.remove(index);
    }

    //4. 도서 수정
    public void updateBook() {
        System.out.println("<<<<도서정보 수정>>>>");
        int index = searchIndex(); //도서있나 확인
        if(index == -1){
            System.out.println("찾는 도서가 없습니다");
        }else{ //-1이 아닐경우 index에 들은 도서내용을 수정
            BookDTO update_book = new BookDTO();
            update_book.setId((booklist.get(index).getId())); //ID정보 가져옴
            update_book.setTitle(booklist.get(index).getTitle());//제목정보 가져옴
            update_book.setAuthor(booklist.get(index).getAuthor());//저자정보 가져옴
            update_book.setYear(booklist.get(index).getYear());//출판연도 정보 가져옴

            System.out.println("<" + booklist.get(index).getTitle()+ "도서의 정보를 수정합니다>");
            System.out.println("제목 : " );
            update_book.setTitle(sc.next());
            System.out.println("저자 : " );
            update_book.setAuthor(sc.next());
            System.out.println("출판연도 : " );
            update_book.setYear(sc.nextInt());
            
            update(index, update_book);
        }
    }
    private void update(int index, BookDTO update_book) {
        booklist.set(index, update_book);
    }



    //입력한 도서명이 있는지 검색하는 메소드
    private int searchIndex() {
        int index = -1;//기본은 -1
        System.out.println("도서명을 입력해주세요");
        System.out.print(">>");
        String name = sc.next();
        for (int i = 0; i <booklist.size(); i++) {
            if(booklist.get(i).getTitle().equals(name)){
                index = i;// 같은 데이터가 있으면 i를 index에 대입
                break;
            }
        }
        return index;
    }


}
