public class ThousandNumbers {
	public static void main(String[] args) {
		int number = 0;
		do {
			if ((number + 1) % 10 != 0) {
				System.out.print(++number + " ");
			}
			else {
				System.out.print(++number + "\n");
			}
		} while (number < 100);
	}
}
