package lr5;

public class Example6 {
    public static void main(String[] args) {

        MinMax first = new MinMax(10, 20);
        first.Show();
        MinMax second = new MinMax(30);
        second.Show();

        first.Setter(4, 50);
        first.Show();
        first.Setter(60);
        first.Show();
    }
    static private class MinMax {
        static int min;
        static int max;
        static void Setter(int a1, int b2) {
            System.out.println("Два аргумента в методе");
            min = Math.min(Math.min(a1, min), b2);
            max = Math.max(Math.max(a1, max), b2);
        }
        static void Setter(int c) {
            System.out.println("Один аргумент в методе");
            min = Math.min(min, c);
            max = Math.max(max, c);
        }
        MinMax(int a1, int b2) {
            System.out.println("Два аргумента в конструкторе");
            min = Math.min(a1, b2);
            max = Math.max(a1, b2);
        }
        MinMax(int c) {
            System.out.println("Один аргумент в конструкторе");
            min = Math.min(min, c);
            max = Math.max(max, c);
        }
        static void Show() {
            System.out.println("Минимальное = " + min);
            System.out.println("Максимальное = " + max);
            System.out.println();
        }
    }
}