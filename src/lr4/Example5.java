package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 3;
        int b = 5;
        int figure[][] = new int[a][b];
        int second[][] = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                figure[i][j] = random.nextInt(9);
                System.out.print(figure[i][j] + " ");
            }
            System.out.println();
        }
        for (int p=0; p<b;p++){
            for (int k=0;k < a;k++){
                second [p][k]= figure [k][p];
                System.out.print(second[p][k]);
            }
            System.out.println();
        }
    }
}