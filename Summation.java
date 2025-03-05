/*
 * Summation.java
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

public class Summation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("The program will add as many numbers as entered. Enter 0 to stop"); // Begin casting numbers to variables
		double num = 0;
		double n = 0; // Loop will still iterate because do-while loops always run at least once
		do {
			n = input.nextDouble();
			num += n;
			System.out.println("The sum is " + num);
		} while (n != 0); // Curiously, the loop doesn't iterate if no number is input, and only ends if the number is 0.
		System.out.println("The total sum is " + num);
		
		input.close();
		
	}
}

