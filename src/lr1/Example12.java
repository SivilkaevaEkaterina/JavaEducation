package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int your_age = in.nextInt();

        int age = your_age;
        int now = 2022;

        System.out.println("Your year of birth: " + (now-age));
        in.close();
    }
}
