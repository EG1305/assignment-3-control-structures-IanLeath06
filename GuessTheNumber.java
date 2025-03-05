/*
 * GuessTheNumber.java
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

public class GuessTheNumber {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int random = (int)(Math.random() * 101);
		int i = 1;
		
		System.out.println("Guess a number in between 1 and 100");
		for (;;) {
			System.out.println("Enter a number");
			int guess = input.nextInt();
			if (guess < random) {
				System.out.println("Too low. Try again.");
				i++;
			} else if (random < guess) {
				System.out.println("Too high. Try again.");
				i++;
			} else {
				System.out.println("Congratulations! You guessed the number in " + i + " tries!");
				break;
			}
		}
		
		input.close();
	}
}

