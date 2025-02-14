public class MultiplesOfTen {
	public static void main(String[] args) {
		int number = 0;
		do {
			if ((number + 1) % 10 != 0) {
				System.out.print((++number * 10) + " ");
			}
			else {
				System.out.print((++number * 10) + "\n");
			}
		} while (number < 100);
	}
}
