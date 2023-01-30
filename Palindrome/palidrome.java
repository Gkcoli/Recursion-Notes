package palincheck;

import java.util.Scanner;



public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int reverse = 0, originalNum = num;
		while (num !=0) {
			int lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num /= 10;

 		}
		if (originalNum == reverse) {
			System.out.println("The number is a palindrome.");
		}else {
			System.out.println("The number is not a palindrome");
		}
		sc.close();
	}
}
