package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = in.nextInt();

        if (number >= 5 && number <= 10){
            System.out.println("Соответствует условиям");
        } else {
            System.out.println("Не соответсвует условиям");
        }
    }
    }