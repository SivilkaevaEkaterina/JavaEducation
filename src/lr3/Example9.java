package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = in.nextInt();
        String more = "";
        String more1 = "";
        int result1 = 0;

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            System.out.println("[" + i + "]" + (array[i]));
            result1 = array[i];
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[min] > array[i])
            {min = i;}
        }
        for (int i = min; i < array.length; i++) {
            if (array[min] == array[i])
            {more += "[" + i + "]";}
        }
        for (int i = min; i < array.length; i++) {
            if (array[min] == array[i])
            {more1 += " " + array[i];}
        }

        System.out.println("Индекс минимального значения: " + more);
        System.out.println("Минимальное значение: " + more1);
    }
}


