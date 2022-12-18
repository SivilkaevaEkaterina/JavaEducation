package lr4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 7; // число строк которое необходимо вывести
        for (int i = figure; i >= 0; i--) {

            for (int j = i; j <= figure; j++) {
                System.out.print("+");
            }
            System.out.println("  ");
        }
    }
}