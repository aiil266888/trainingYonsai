package java_1118;

public class Marray1 {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        for(int i = 0; i< mathScores.length; i++){
            for(int k = 0; k<mathScores[i].length; k++){
                mathScores[i][k] = (int)((Math.random())*100);
                System.out.print(mathScores[i][k]  + " ");
            }
            System.out.println();
        }
    }
}
