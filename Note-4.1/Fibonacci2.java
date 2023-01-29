import java.util.Scanner;

public class App {
    static int count = 0;

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter M: ");
      int m = input.nextInt();
        System.out.print("Enter N: ");
      int n = input.nextInt();
        System.out.print(m + " " + n + " ");
        fibonacci(m, n, count);
    }

    public static void fibonacci(int m, int n, int count) {
        if (count < 13) {
        count++;
        int f = m + n;
        System.out.print(f + " ");
          fibonacci(n, f, count);
        }
    }
}
