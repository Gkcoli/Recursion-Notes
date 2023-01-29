import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    //Creates a new Scanner object that reads from the standard inpu
    Scanner sc = new Scanner(System.in);
    //It Prompts the user to enter a number.
    System.out.print("Enter a number: ");
    //Reads the user's input as an integer and stores it in the num variable.
    int num = sc.nextInt();
//Calls the factorial method, passing num as an argument, and stores the result in the result variable.
    int result = factorial(num);
    //Prints the result to the console.
    System.out.println("The factorial of " + num + " is " + result);
  }

  public static int factorial(int n) {// Defines the factorial method.
    // Base case: if n is 0 or 1, return 1
    if (n <= 1) {//If the value of n is less than or equal to 1, this code block will be executed.
      
        return 1;//Returns 1, which is the base case of the factorial calculation.
    }
    // Recursive case: multiply n by the factorial of (n-1)
    
    else {//If the value of n is greater than 1, this code block will be executed.
      
        return n * factorial(n-1);//Returns the product of n and the result of calling the factorial method with n-1 as the argument. 
        //This is the recursive step, as the function calls itself with a reduced value of n until n is 1 or 0.
    }
  }
}
