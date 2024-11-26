package java_1126.Hak3;

public class Student {
    private String name; //이름
    private String studentId; //학번

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "이름='" + name + '\'' +
                ", 학번='" + studentId + '\'' +
                '}';
    }
}
