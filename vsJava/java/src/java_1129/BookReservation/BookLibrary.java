package java_1129.BookReservation;

public class BookLibrary {
    private String name;//책 이름
    private String location;//책위치
    private String booktype;//책 장르
    private boolean available;//예약가능여부

    public BookLibrary(String name, String location, String booktype, boolean available) {
        this.name = name;
        this.location = location;
        this.booktype = booktype;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "BookLibrary{" +
                "제목='" + name + '\'' +
                ", 서고위치='" + location + '\'' +
                ", 장르='" + booktype + '\'' +
                ", 대출가능 여부=" + available +
                '}';
    }
}
