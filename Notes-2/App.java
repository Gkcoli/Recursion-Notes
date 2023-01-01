import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How far do you want to run (kilometers)?: ");
        int distance = scan.nextInt();

        Loveyloveydovey(0,distance);
     }

     static void Loveyloveydovey(int i,int distance){
        if(i<distance){
            i++;
            System.out.println("*you take a step* : "+i+" kilometers");
            Loveyloveydovey(i, distance);
        }
        else{
            System.out.println("You are done running! :>");
        }
     }
}
