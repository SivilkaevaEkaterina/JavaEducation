package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = in.nextInt();

        int resultFirst = number % 5;
       int resultSecond = number % 7;

        if (resultFirst == 2){
            System.out.println("Введенное число удовлетворяет условиям");
        } else {
            System.out.println("Введенное число не удовлетворяет условиям");
        }

        if (resultSecond == 1){
            System.out.println("Введенное число удовлетворяет условиям");
        } else {
            System.out.println("Введенное число не удовлетворяет условиям");
       }
    }
}
