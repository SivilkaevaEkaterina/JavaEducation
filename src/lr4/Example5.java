package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int figure[][] = new int[3][3];
        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure[i].length; j++) {
                figure[i][j] = random.nextInt(9);
                System.out.print(figure[i][j]+" ");

            }
            System.out.println();
        }
        reverse(figure);
        printArray(figure);
    }
    public static void reverse(int changing[][]) {
        System.out.println(" ");
        for(int i=0; i< changing.length-1; i++) {
            for(int j=i+1; j< changing[i].length; j++) {
                int temp = changing[i][j];
                changing[i][j] = changing[j][i];
                changing[j][i] = temp;

            }
        }
    }
    public static void printArray(int anotherFigure[][]){
        for(int i=0;i<anotherFigure.length; i++) {
            for(int j = 0; j< anotherFigure[i].length; j++) {
                System.out.print(anotherFigure[i][j]+" ");
            }
            System.out.println();
        }
    }
}