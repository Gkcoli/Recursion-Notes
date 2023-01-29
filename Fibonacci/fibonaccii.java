import java.util.Scanner;


public class fibonaccii {
  public static void main(String[] args) {
	//The first line imports the Scanner class to take user input.  
	  Scanner sc = new Scanner(System.in);
    //The next line prompts the user to enter the number of terms they want to generate using the System.out.print method.

	  System.out.print("Enter the number of terms: ");
   //The user input is stored in the n variable using the nextInt method of the Scanner class.

	  int n = sc.nextInt();
    //A for loop is then used to generate the Fibonacci sequence and print each term on the same line, separated by a space.
	//The loop runs n times, and the fibonacci method is called each time with a different value of i as the argument.
     for (int i = 0; i < n; i++) {
      //The fibonacci method is a recursive method that generates the Fibonacci sequence.
		  System.out.print(fibonacci(i) + " ");
    
	  }

}
  
  // Recursive method to generate fibonacci sequence
  public static int fibonacci(int n) {
   //If n is 0 or 1, the method returns n immediately, as these are the first two terms of the sequence.
   //If n is greater than 1, the method returns the sum of the previous two terms, which are calculated by making recursive calls to the fibonacci method with n - 1 and n - 2 as the arguments.

	  if (n == 0 || n == 1) {
		  return n;
		  //This continues until the base case of n being 0 or 1 is reached, and the method returns the appropriate value, which is then used to calculate the sum of the previous two terms in the previous call, and so on, until the original call to fibonacci has been completed and the value is returned to the main method.
    }
    // Recursive call to generate previous two terms
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
