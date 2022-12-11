package lr3;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = in.nextInt();


        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(2);
            System.out.println("[" + i + "]" + (numbers[i]));

        }
        IntSummaryStatistics stat = Arrays.stream(numbers).summaryStatistics();
        int min = stat.getMin();

        for (var i = 0; i < numbers.length; i++)
            if (min == numbers[i])
                System.out.println(min + " [" + i + "]");
    }
}


