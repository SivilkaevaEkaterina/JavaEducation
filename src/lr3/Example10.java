package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import  java.util.Scanner;

    public class Example10 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Random random = new Random();
            Integer[] numb = new Integer [10];
            for (int i = 0 ; i < numb.length ; i++ ){
                numb[i] = random.nextInt(20);
            }
            Arrays.sort(numb, Collections.reverseOrder());

            for (int values : numb) {
                System.out.print(values + ", ");
            }
        }
    }






