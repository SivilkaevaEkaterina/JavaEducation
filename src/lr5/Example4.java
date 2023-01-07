package lr5;
public class Example4 {
    public static void main(String[] args) {
        double num = 65.1267;
        Different different = new Different(num);
    }
}
class Different{
        public char a1;
        public int b1;
    public Different (double number) {
            char a1 = (char) number;
            int b1 = (int) ((number-(int)number)*100);
            System.out.println("Символьное поле " + a1);
            System.out.println("Целочисленное поле " + b1);
        }

    }
