package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Введите количество чисел ");
        int size = in.nextInt();

        int[] numbers = new int[size];

        System.out.println("Введите числа ");
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += numbers[i];
        }
        System.out.println(total);
    }
}



