package lr5;

public class Example3 {
    public static void main(String[] args) {
        Test test = new Test();
    }
}
class Test {
    private int numm;
    private int numm2;
    public Test(){
        System.out.println("Пустой конструктор");
    }

    public Test(int numm ){
        this.numm = numm;
        System.out.println("Конструктор с одним аргументом");
    }
    public Test(int numm, int numm2){
        this.numm = numm;
        this.numm2 = numm2;
        System.out.println("Конструктор с двумя аргументами");
    }
}
