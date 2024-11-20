package java_1120;

public class RoleEx {
    public static void main(String[] args) {
        Role role = Role.ADMIN;

        //역할출력
        System.out.println("현재 역할 : " + role); //출력 - 현재 역할 : ADMIN
        System.out.println("일반 사용자 역할 : " + Role.USER); //출력- 일반 사용자 역할: USER

        //역할 확인
        if (role == Role.ADMIN){
            System.out.println("관리자 권한이 있습니다");
        }else if (role == Role.USER){
            System.out.println("일반 사용자입니다");
        }
    }
}
