package lr6;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Количество элементов исходно: ");
        int lenght = in.nextInt();
        System.out.print("Количество элементов после преобразования : ");
        int lenght2 = in.nextInt();
        if (lenght <= 0) {
            System.out.print("Вы не указали числа ");
        } else {
            System.out.print("Первоначальный массив ");
            int[] numbers = new int[lenght];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
                System.out.print(numbers[i] + " ");
            }
            Ex6lr6.Arr(numbers, lenght2);
        }
    }
}
class Ex6lr6 {
    static void Arr(int[] numbers, int num) {
        if (num > numbers.length) {
            System.out.print("\nСозданный массив: ");
            int [] ArrayFirst = new int [numbers.length];
            for (int i = 0; i < ArrayFirst.length; i++) {
                ArrayFirst [i] = numbers [i];
                System.out.print(ArrayFirst[i] + " ");
            }
        } else if (num < numbers.length) {
            System.out.print("\nСозданный массив: ");
            int [] ArraySecond = new int [num];
            for (int i = 0; i < ArraySecond.length; i++) {
                ArraySecond [i] = numbers [i];
                System.out.print(ArraySecond[i] + " ");
            }
        }
    }
}
