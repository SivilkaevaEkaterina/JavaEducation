package lr4;

public class Example7 {
    public static void main(String[] args) {
        int n = 6;
        int[][] snake = new int[n][n];

        int first = 0;
        int second = 0;
        int a = 1;
        int b = 0;
        int x = 0;
        int y = n;

        for (int i = 0; i < n * n; i++) {
            snake[first][second] = i + 1;
            if (--y == 0) {
                y = n * (x % 2) +
                        n * ((x + 1) % 2) -
                        (x / 2 - 1) - 2;
                int temp = a;
                a = -b;
                b = temp;
                x++;
            }
            second += a;
            first += b;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(snake[i][j] + "\t");
            System.out.println();
        }
    }
}


