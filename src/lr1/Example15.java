package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input fist figure: " );
        int first_figure = in.nextInt();

        System.out.println("Input second figure: " );
        int second_figure = in.nextInt();

        int sum = first_figure+second_figure;
        int difference = first_figure-second_figure;

        System.out.println(sum);
        System.out.println(difference);
        in.close();
    }
}
