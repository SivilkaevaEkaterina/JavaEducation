package lr4;

import java.util.Random;
public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] first = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] second = new int[2][2];
        int a = random.nextInt(3);
        int b = random.nextInt(3);

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                System.out.print(first[i][j] + " ");
            }
            System.out.println();
        }
        int x=0;
        int y=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != a && j != b) {
                    second[x][y] = first[i][j];
                    y=(y+1) %2;
                    if (y==0 || j==2) {
                        x++;
                    }
                }
            }
        }
        System.out.println("строка " + a + " столбец " + b);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(second[i][j]);
            }
            System.out.println();
        }
    }
}