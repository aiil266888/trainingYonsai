package java_1211.JAVAair;

public class Passenger { //예매정보를 저장 = 나이검증하는곳
    private String name;
    private int birthDate;
    private String pw;
    private String seat;
    private int age = 840315;

    public Passenger(String name, int birthDate){
        this.name= name;
        this.birthDate= birthDate;
    }
    public Passenger(String name, int birthDate, String pw){
        this.name = name;
        this.birthDate=birthDate;
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    //15세 이상만 국제선 예약 가능하도록
    public boolean man15(Passenger p){
        int y = p.birthDate/10000; //83.1016->83이됨
        int m = (p.birthDate%10000);
        //831016 / 10000 나머지 1016
        int d = p.birthDate % 100; //나머지 16

        return age > 15;
    }
}//END passenger
