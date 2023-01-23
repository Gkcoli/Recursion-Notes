public class App {
    public static void main(String[] args) throws Exception {
        
  public class shyshy {
	
	public static void main(String[] args) {
		 // this part will prompt the user to input a factorial that you like.
		 //5! = 5 * (4 * 3 * 2 * 1) = 120
        System.out.println(factorial(5));// enter the factorial here
       }
    public static int factorial(int n){// call the method this may be used later on
        if(n == 1){
           System.out.println("factorial(" + n + ") = 1");
           return 1;
        }
        else{// this will add the desired factorial that you input
            System.out.println("factorial("+ n +  ") = " + n + "* factorial(" + (n - 1) + ")");
            return n * factorial(n - 1);// if this code works it's a miracle
        }
    }
}   
