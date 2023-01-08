package lr6;

public class Example7 {
    public static void main(String[] args) {
        char[] array = new char[]{'A','B','C'};
        System.out.printf("%6s\n", "A B C" );
        for (int i=0;i< array.length;i++){
            System.out.print(Changer.Change(array)[i] + " ");
        }
    }
    static class Changer{
        static int[] Change(char[] let){
            int[] letter = new int[let.length];
            for (int i=0;i<letter.length;i++){
                letter[i]=let[i];
            }
            return letter;
        }
    }
}


