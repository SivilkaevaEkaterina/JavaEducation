package lr6;

public class Example8 {
    public static void main(String[] args) {
        int[] Array = new int[]{123,456,789,876,543};
        System.out.print("Average "+ Average.Ex8lr6(Array));
    }
    static class Average {
        static double Ex8lr6 (int [] numbers) {
            double result = 0;
            for (int i = 0; i < numbers.length; i++){
                result += numbers[i];
            }
            result /= numbers.length;
            return result;
        }
    }
}