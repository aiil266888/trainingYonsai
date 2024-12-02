package java_1129.BookReservation;

public class BookDTO {
    private int id; //도서 ID
    private String title;//책 이름
    private String author;//저자
    private int year;//출판연도

    public BookDTO(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public BookDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "책 ID =" + id +
                ", 제목 ='" + title + '\'' +
                ", 저자 ='" + author + '\'' +
                ", 출판연도 =" + year +
                '}';
    }
}

