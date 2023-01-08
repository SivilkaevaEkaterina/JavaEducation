package lr6;

public class Example10 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};

        System.out.println("Наименьшее и наибольшее число ");
        array = Changer.change(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    static class Changer {
        static int[] change (int[] numbers){
            int max = 0;
            int min = 3;
            int[] a = numbers;
            int[] b = new int[2];

            for (int i = 0; i<a.length; i++){
                if (a[i] < min){
                    min=a[i];
                } else { if (a[i] > max){
                    max = a[i];
                }
                }
            }
            b[0] = min;
            b[1] = max;
            return b;
        }
    }
}