package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = in.nextInt();

        int result = number % 4;

        if (result == 0 && number > 10){
            System.out.println("Введенное число соответствует условиям");
        } else {
            System.out.println("Введенное число не соответсвует условиям");
        }

    }
}
