package lr3;

import java.util.ArrayList;

public class Example8 {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Character> arrayList = new ArrayList<Character>(size);

        char l = 'B';
        int i = 0;

        while (i != size) {
            arrayList.add(l);
            if (arrayList.remove(Character.valueOf('E'))){
                i--;
            } else { if (arrayList.remove(Character.valueOf('I'))){
                i--;
            }
            }
            l++;
            i++;
        }
        System.out.println(arrayList);
    }
}