package lr3;

import java.util.Scanner;
import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        int first = in.nextInt();

        System.out.println("Введите второе число");
        int second = in.nextInt();

        if (first>second){
            System.out.println(second + "," + first);
        } else {
            System.out.println(first + "," + second);
        }


    }
}
