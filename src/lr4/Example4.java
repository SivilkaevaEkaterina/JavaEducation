package lr4;

public class Example4 {
    public static void main(String[] args) {
        String[][] figure = {{"*"},
                {"*", "*"},
                {"*", "*", "*"}};
        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure[i].length; j++) {
                System.out.print(figure[i][j] + "");
            }
            System.out.println();
        }
    }
}