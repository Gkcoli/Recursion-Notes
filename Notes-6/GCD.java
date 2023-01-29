import java.util.Scanner;

public class TowerniRyujen{
  
  public static int gcd(int a, int b) {
    // Base case: if b is 0, then gcd(a, b) = a
    if (b == 0) {
      return a;
    }
    // Recursive case: gcd(a, b) = gcd(b, a % b)
    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    int result = gcd(a, b);
    System.out.println("The GCD of " + a + " and " + b + " is " + result);
  }
}
