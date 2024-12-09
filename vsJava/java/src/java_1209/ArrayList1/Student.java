package java_1209.ArrayList1;

public class Student {
        private String name;
        private String studentId;
        private int age;

        public Student(String name, String studentId, int age) {
            this.name = name;
            this.studentId = studentId;
            this.age = age;
        }

    public Student() {

    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", studentId='" + studentId + '\'' +
                    ", age=" + age +
                    '}';
        }
}

