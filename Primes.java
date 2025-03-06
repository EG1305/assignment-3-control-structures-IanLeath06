/*
 * Primes.java
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

public class Primes {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number. This program will find all primes less than this number");
		int n = input.nextInt();
		int primecount = 0;
		int i = 0;
		do {
			boolean prime = true;
			for (int j = 2; j <= (i/2); j++) {
					if (i % j == 0)
						prime = false;
					}
					if (i < 3)
						prime = false;
			if (prime) {
				System.out.print(i + "	");
				primecount++;
			}
			i++;
		} while (i < n);
		System.out.println("\nThere are " + primecount + " primes in between 0 and " + n);
		input.close();
	}
}

