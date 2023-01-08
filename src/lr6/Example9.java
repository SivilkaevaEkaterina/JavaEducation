package lr6;

public class Example9 {
    public static void main(String[] args) {
        System.out.print(" Первоначальное значение: ");
        char c = 'К';
        char[] array = new char[5];
        for(int i = 0; i < array.length; i++) {
            array[i] = c;
            c++;
            System.out.print(array[i] + " ");
        }
        Changer.Change(array);
    }
}
class Changer {
    static void Change (char[] array) {
        char a;
        int b = array.length - 1;
        System.out.print("\n Изменено местами: ");
        for(int i = 0; i < (array.length); i++) {
            if (i < b) {
                a = array[i];
                array[i] = array[b];
                array[b] = a;
            } else if (i >= b) {
                break;
            }
            b--;
        }
        for(int i = 0; i < (array.length); i++) {
            System.out.print(array[i] + " ");
        }
    }
}