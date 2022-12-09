package lr3;

import java.util.Scanner;
import java.util.Arrays;

public class Example4a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = in.nextInt();

        System.out.println("Введите второе число");
        int second = in.nextInt();

        int[] result = {first, second};

        Arrays.sort(result);

        for (int i = 0; i<2; i++) {
            System.out.println(result[i]);
        }


    }
}
