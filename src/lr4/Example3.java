package lr4;

public class Example3 {
    public static void main(String[] args) {
        int [][] sq = {{2,2,2},
                       {2,2,2},
                       {2,2,2}};
        for (int i =0; i< sq.length; i++){
            for (int j=0; j<sq[i].length;j++){
                System.out.print(sq[i][j] +" ");
            }
            System.out.println();
        }
    }
}
