package java_1126.Hak3;

public class Grade extends Student{
    private int score;

    public int getScore() {
        return score;
    }

    public Grade(String name, String studentId, int score) {
        super(name, studentId);//부모 클래스의 생성자를 호출
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{ 성적 :"+ super.toString() + "} { 성적평가 : " + evaluateGrade() +" }";
    }

    public String evaluateGrade() {
        if(score>=90){
            return "A";
        }else if(score>=80){
            return "B";
        }else if(score>=70){
            return "C";
        }else if(score>=60){
            return "D";
        }else{
            return "F";
        }
    }
}
