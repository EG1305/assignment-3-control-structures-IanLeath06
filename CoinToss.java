/*
 * CoinToss.java
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
 * along with this program; if not, write to the FreSe Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.Scanner;
import java.lang.Math;

public class CoinToss {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many coin tosses do you need?");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			int C = (int)(Math.random() * 2);
			boolean A = C == 1; // Cheeky way to convert int into boolean
			System.out.println("Toss:	" + ((A) ? "heads" : "tails")); // Ternary operator just makes things look cleaner
		}
		input.close();
	}
}

