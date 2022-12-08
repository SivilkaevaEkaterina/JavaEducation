package lr3;

import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива ");
        int num = in.nextInt();
        int[] numbers = new int[num];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i<numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];

        }
        for (int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        }


    }




// Напишите программу, которая выводит последовательность чисел
//    Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//    следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//   в последовательности вводится пользователем. Предложите версии
//   программы, использующие разные операторы цикла.