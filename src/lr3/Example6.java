package lr3;

import java.util.Scanner;
import java.util.Random;
public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива ");
        int size = in.nextInt();

        if (0 < size) {

            int[] numbers = new int[size];
            Random rand = new Random();
            int i = 0;

            while (i != size) {

                int result = rand.nextInt(50);
                if (result % 5 == 2) {
                    numbers[i] = result;
                    i++;
                }
            }
            for (int numb : numbers) {
                System.out.println(numb);
            }
        } else {
            System.out.println("Размер массива не может быть меньше или равен нулю");
        }
    }
}
