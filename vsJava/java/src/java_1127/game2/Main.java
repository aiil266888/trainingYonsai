package java_1127.game2;

public class Main {
    public static void main(String[] args) {
        Hero[] heros = new Hero[3];//부모 객체를 배열로 선언
        heros[0] = new Warrior("전사");
        heros[1] = new Warrior("무도가");
        heros[2] = new Warrior("흑마도사");

        for(int i = 0 ; i < heros.length; i++){
            heros[i].attack();
            if(heros[i] instanceof Warrior){
                Warrior temp = (Warrior)heros[i];//부모 배열에 있는 타입을 다운캐스팅
                temp.cham();
            }else if(heros[i] instanceof Dancer){
                Dancer temp = (Dancer)heros[i];
                temp.DancePartner();
            }else if (heros[i] instanceof BlackMage){
                BlackMage temp = (BlackMage)heros[i];
                temp.Enochian();
            }else{
                System.out.println("무직");
            }
        }

    }

}
