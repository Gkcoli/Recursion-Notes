import java.util.Scanner;

public class TowerniRyujen {
    // variable to keep track of the number of moves
    static int count = 0;

    public static void main(String[] args) {
        // create a new Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of discs: ");
        // assign the number of discs to the variable 'n'
        int n = sc.nextInt();
        // call the hanoi function with the number of discs, the starting rod, the ending rod, and the auxiliary rod as arguments
        hanoi(n, 'A', 'C', 'B');
        // print the total number of moves made
        System.out.println("Total number of moves: " + count);
    }

    // hanoi function to solve the problem
    static void hanoi(int n, char from_rod, char to_rod, char aux_rod) {
        // increment the move count
        count++;
        // base case: if there is only one disc, move it from the starting rod to the ending rod
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        // move n-1 discs from the starting rod to the auxiliary rod using the ending rod
        hanoi(n-1, from_rod, aux_rod, to_rod);
        // move the remaining disc from the starting rod to the ending rod
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        // move the n-1 discs from the auxiliary rod to the ending rod using the starting rod
        hanoi(n-1, aux_rod, to_rod, from_rod);
    }
}
