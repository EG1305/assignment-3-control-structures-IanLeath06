/*
 * Mersenne.java
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
import java.lang.Math;

public class Mersenne {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number. This program will find all mersenne primes less than this number");
		int n = input.nextInt();
		int primecount = 0;
		int p = 3;
		double m = 0; // Initialize variables for later
		do {
				boolean prime = true;
				m = (Math.pow(2, p) - 1);
				double s = 4; // Reset s for next iteration
				for (int i = 0; i < p - 2; i++) {
					s = ((Math.pow(s, 2) - 2) % m);
				}
				prime = s == 0; 		// While this iteration of code works, it does not display 3 or 2^31 - 1
				if (prime && m <= n) { // ecause 3 is too small for this code to display, and because 2^31 - 1 is too large
					System.out.print((int)m + "	");
					primecount++;
					}
				p++;
		} while (m <= n);
		System.out.println("\nThere are " + primecount + " mersenne primes in between 0 and " + n);
		input.close();
	}
}

