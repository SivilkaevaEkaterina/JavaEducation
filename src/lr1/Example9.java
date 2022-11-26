package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name of the month: ");
        String name_of_the_month = in.nextLine();

        System.out.println("Input number of days in the month: ");
        int number_of_days_in_the_month = in.nextInt();

        System.out.println(" " + number_of_days_in_the_month + " days in " + name_of_the_month);
        in.close();
    }
}
