package lr6;

public class Example5 {
    public static void main(String[] args) {
        int number = 5;
        System.out.print("С рекурсией число " + number + " = ");
        Task5.With(number);
        Task5.Without(number);
    }
}
class Task5 {
    static int result = 0;
    static void With(int number) {
        if (number > 0) {
            result += Math.pow(number, 2);
            number--;
            With(number);
        } else if (number == 0) {
            System.out.println(+result);
        }
    }
    static void Without(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += Math.pow(i, 2);
        }
        System.out.println("Без рекурсии число " + number + " = " + result);
    }
}
