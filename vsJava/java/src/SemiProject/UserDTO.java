package SemiProject;

public class UserDTO {
    private String id;
    private String pw;
    private String name;
    private int age;
    private String grade;
    private String department;
    private String phone;
    private String address;
    private int adminflag = 0;

    public UserDTO(String id, String pw, String name, int age, String grade, String department, String phone, String address, int adminflag) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.department = department;
        this.phone = phone;
        this.address = address;
        this.adminflag = adminflag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAdminflag() {
        return adminflag;
    }

    public void setAdminflag(int adminflag) {
        this.adminflag = adminflag;
    }

    @Override
    public String toString() {
        String flag;
        if(adminflag == 0){
            flag  = "일반사원";
        }else{
            flag = "관리자";
        }


        return "UserDTO{" +
                "아이디='" + id + '\'' +
                ", 이름='" + name + '\'' +
                ", 나이=" + age +
                ", 직급='" + grade + '\'' +
                ", 부서='" + department + '\'' +
                ", 연락처='" + phone + '\'' +
                ", 주소='" + address + '\'' +
                ", 유저등급=" + flag +
                '}';
    }
}
