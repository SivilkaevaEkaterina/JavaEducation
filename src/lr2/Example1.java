package lr2;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = in.nextInt();

        int result = number % 3;
        System.out.println("result = " + result);
        if (result == 0){
            System.out.println("Введенное число делится на три без остатка");
        } else {
            System.out.println("Введенное число не делится на три без остатка");
        }
    }
}
