package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a figure: ");
        int figure = in.nextInt();

        int one = 1;
        int first_result = figure-one;
        int second_result = figure+one;
        int sum = first_result+figure+second_result;

        System.out.println ((first_result) + "," + (figure) + "," + (second_result) + "," + (Math.pow(sum,2)));
        in.close();


    }
}
