package lr6;

public class Example4 {public static void main(String[] args) {
    System.out.println("Без рекурсии: ");
    WithoutF.Without(5);
    WithoutF.Without(6);
    System.out.println("С рекурсией: ");
    WithF.Without(5);
    WithF.Show();
    WithF.Refresh();
    WithF.Without(6);
    WithF.Show();
}
    static class WithoutF{
        static void Without(int one){
            int result=1;
            while (one>0){
                if (one > 2) {
                    result *= one;
                } else if (one == 2) {
                    result *= 2;
                } else if (one == 1) {
                    result *= 1;
                }
                one=-2;
            }
            System.out.println(result);
        }
    }
    static class WithF{
        static int result = 1;
        static void Without(int one){
            result *= one;
            if (one-2>2){
                Without(one-2);
            } else if (one-2==2) {
                result *= 2;
            } else if (one-2==1) {
                result *= 1;
            }
        }
        static void Show(){
            System.out.println(result);
        }
        static void Refresh(){
            result = 1;
        }
    }
}