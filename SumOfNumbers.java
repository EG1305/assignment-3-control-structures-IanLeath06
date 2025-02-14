import java.util.Scanner;
public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("This program will add all numbers in between 0 and the number you enter:");
		int n = input.nextInt();
		System.out.println("You entered " + n);
		int number = 1;
		int summer = 1;
		while (++number <= n) {
			summer = summer + number;
		}
		System.out.println("The sum of all numbers from 1 to " + n + " is " + summer);
	}
}
		
