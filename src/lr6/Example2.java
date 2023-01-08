package lr6;

public class Example2 {
    public static void main(String[] args) {
        Ex2Lr6.constant();
    }
}
class Ex2Lr6{

    private static int one = 0;

    static void constant(){
        System.out.println("Текущее значение статического поля: " + one);
        one = one+1;
        System.out.println("Значение статического поля увеличено на один: " + one);
    }

}