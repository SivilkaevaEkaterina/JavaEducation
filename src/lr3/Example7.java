package lr3;

public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] result = new char[size];
        char let = 'a';

        for (int i = 0; i < result.length; i++) {
            result[i] = let++;
            let++;
            System.out.println(result[i]);
        }
        System.out.println();
        for (int t = size - 1; t >= 0; t--) {
            System.out.println(result[t]);
        }
    }
}






