package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String your_name = in.nextLine();

        System.out.println("Input year or your birth: ");
        int year_of_your_birth = in.nextInt();

        int birth = year_of_your_birth;
        int now = 2022;

        System.out.println(" " + your_name + ", " + (now-birth));
        in.close();
    }
}
