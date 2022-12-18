package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String text = in.nextLine();

        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();

        char[] chars = text.toCharArray();
        int[]ints = new int[text.length()];

        System.out.println("chars до преобразования" + Arrays.toString(chars));

        for (int i=0; i< chars.length;i++){
            ints[i]=chars[i]+key;
        }
        System.out.println("ints после преобразования" + Arrays.toString(ints));
        for (int i = 0;i< chars.length;i++){
            chars[i] = (char) ints[i];
        }
        System.out.println("chars после преобразования" + Arrays.toString(chars));
    }
}
