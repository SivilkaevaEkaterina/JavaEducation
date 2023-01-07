package lr5;

public class Example5 {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(200);
        System.out.println("(Конструктор) Больше 100: " + numbers.numb());

        numbers.open(200);
        System.out.println("Больше 100: " + numbers.numb());

        numbers.open(88);
        System.out.println("Диапазон до 100: " + numbers.numb());

        numbers.open();
        System.out.println("Без аргумента: " + numbers.numb());
    }
}
class Numbers {
    private int a1;
    public void open(int b1) {
        a1 = b1;
        if (b1 >= 100) {
            a1 = 100;}
        if (b1 <= 0) {
            a1 = 0;}
    }
    Numbers(int a1) {
        this.open(a1);
    }
    public void open() {
        a1 = 0;
    }
    public int numb() {
        return a1;
    }
}

