/*
 * PrimeCheck.java
 * 
 * Copyright 2025 Ian Leath <ianleath@semarang-neo>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.Scanner;

public class PrimeCheck {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will tell you whether or not the number you enter is prime or not.\nYou can enter 0 any time you'd like to end the program.");
		int n = 1; // Set it and forget it
		do {
			System.out.println("Please enter a number");
			n = input.nextInt();
			boolean prime = true; // I think this works
			if (n < 3) prime = false; // It will print prime for 0 - 2 so I'll just manually set them to not prime
			for (int i = 2; i <= (n/2); i++) {
				if (n % i == 0)
					prime = false;
			}
			System.out.println(n + " is " + ((prime) ? "" : "not ") + "prime");
		} while (n != 0);
		input.close();
	}
}

