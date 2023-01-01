import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Im Fearless Count: ");
        int number = scan.nextInt();

        Yunjin(number);
     }

     static void Yunjin(int n){
        if(n>0){
            System.out.println("Watchu Lookin at?");
            n--;
            Yunjin(n);
        }
     }
}
