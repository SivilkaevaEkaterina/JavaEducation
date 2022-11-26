package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input year of birth: ");
        int year_of_birth = in.nextInt();

        int birth = year_of_birth;
        int now = 2022;

        System.out.println("Your age is " + (now-birth));

        in.close();


    }

}
