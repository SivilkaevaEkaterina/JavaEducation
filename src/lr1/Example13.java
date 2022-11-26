package lr1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first figure: ");
        int first_figure = in.nextInt();

        System.out.println("Input second figure: ");
        int second_figure = in.nextInt();

        System.out.println(first_figure+second_figure);
        in.close();
    }
}
