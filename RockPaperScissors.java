import java.lang.Math;
import java.util.Scanner;
public class RockPaperScissors {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int random = (int)(Math.random() * 10);
		int computer = random % 3;
		System.out.println("Enter 0, 1, or 2\nscissors (0), rock (1), paper (2)");
		int human = input.nextInt();
		if (human == 0 && computer == 1) {
			System.out.println("You lose: rock beats scissors");
		}
		else if (human == 0 && computer == 1) {
			System.out.println("You lose: rock beats scissors");
		}
		else if (human == 0 && computer == 2) {
			System.out.println("You win: scissors beats paper");
		}
		else if (human == 1 && computer == 0) {
			System.out.println("You win: rock beats scissors");
		}
		else if (human == 1 && computer == 2) {
			System.out.println("You lose: paper beats rock");
		}
		else if (human == 2 && computer == 0) {
			System.out.println("You lose: scissors beats paper");
		}
		else if (human == 2 && computer == 1) {
			System.out.println("You lose: paper beats rock");
		}
		else if (human == computer) {
			System.out.println("Tie");
		}
		input.close();
	}
}
