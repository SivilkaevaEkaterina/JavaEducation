package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name of the week: ");
        String name_of_the_week = in.nextLine();

        System.out.println("Input name of the month: ");
        String name_of_the_month = in.nextLine();

        System.out.println("Input day of the month: ");
        int day_of_the_month = in.nextInt();

        System.out.println(" " + name_of_the_week + "," + day_of_the_month + "," + name_of_the_month);
        in.close();
    }
}
