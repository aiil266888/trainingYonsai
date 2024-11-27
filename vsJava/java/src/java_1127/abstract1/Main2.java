package java_1127.abstract1;


import java_1127.game2.Warrior;

abstract class GameCharacter{
    //템플릿 메서드 - 공통 로직을 제공, 세부구현은 자식에
    public void performAction(){
        prepare();
        action();
        finish();
    }

    private void prepare(){
        System.out.println("캐릭터를 생성합니다");
    }
  //추상메서드 : 구체적인 행동은 자식 클래스에서 구현
    private void action(){
        System.out.println("마법사가 마법을 시전합니다");
    }
    private void finish(){
        System.out.println("전투를 종료합니다");
    }
}

////------------------------MAIN---------------------------
//public class Main2 {
//    public static void main(String[] args) {
//        GameCharacter warrior = new Warrior();//자식을 부모로 업캐스팅
//        GameCharacter mage = new Mage();//
//
//        System.out.println("전사 행동 : ");
//        warrior.performAction();
//
//        System.out.println("\n마법사 행동 : ");
//        mage.performAction();
//    }
//
//}
