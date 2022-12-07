package lr3;

import java.util.Scanner;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int number = in.nextInt();

        System.out.println("Размер массива равен"+number);
        int[] randomNumbers = new int[number];
        for (int i=0; i<randomNumbers.length; i++ ) {

            Arrays.sort(randomNumbers);
            System.out.println("Элемент массива["+i+"]=" + randomNumbers[i]);
        }




        }
    }












   // Напишите программу, которая выводит последовательность чисел
    //    Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
    //    следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
     //   в последовательности вводится пользователем. Предложите версии
     //   программы, использующие разные операторы цикла.

