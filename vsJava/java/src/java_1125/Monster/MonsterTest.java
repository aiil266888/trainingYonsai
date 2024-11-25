//package java_1125.Monster;
//
//public class MonsterTest {
//    public static void main(String[] args) {
//        Monster OmegaF = new Monster("오메가F");
//        Monster OmegaM = new Monster("오메가M");
//        Monster.battle(OmegaM,OmegaF);
//     }
//}
//
//class Monster{
//    private String name;
//    private int hp;
//    private static int  maxHp= 30;//모든 몬스터의 최대 체력
//
//    public Monster(String name, int hp) {
//        this.name = name;
//        //this.hp = hp = 30;
//
//        this.hp = maxHp;
//    }
//}
//public static void battle(Monster F, Monster M){
//    while(F.hp>0 && M.hp>0){
//        Monster attacker = (Math.random() < 0.5) ? F: M; //확률 반반으로 F아님 M 선공
//        Monster defender = (attacker == F ) ? M : F ;
//        attacker.attack(defender);
//    }
//}
//private void attack(Monster enemy){
//    System.out.printf("[%s]의 공격 : ",name);
//    enemy.hp = enemy.hp - 10;
//    System.out.printf("%s 의 체력 : %d/(%d)\n" , enemy.name, enemy.hp, Monster.maxHp);
//}
//
