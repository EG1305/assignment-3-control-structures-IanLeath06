/*
 * FindSquareRoot.java
 * 
 * Copyright 2025 Ian Leath <Ian Leath@PAPUA>
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

public class FindSquareRoot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//double lastGuess = 1;
		//double nextGuess = 1;
		//double placeholder = 2; // Make sure placeholder initially is greater than lastGuess
		System.out.println("This program will find the square root of a number.\nPlease enter a positive integer.");
		int n = input.nextInt();
		double lastGuess = n + 1;
		double nextGuess = n;

		int iteration = 0;
		
		
		while ((lastGuess - nextGuess) > 0.000001) {
			lastGuess = nextGuess;
			nextGuess = ((lastGuess + (n / lastGuess)) / 2);
			//placeholder = nextGuess;
			iteration++;
		}
		System.out.println("The square root of " + n + " is " + nextGuess + "\nThe program found this in " + iteration + " iterations.");
		input.close();
	}
}

