/*
 * FindPi.java
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
import java.lang.Math;
import java.util.Scanner;

public class FindPi {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will iteratively find pi using the Leibniz formula.\nHow many iterations should we use? Please enter a number.");
		int n = input.nextInt(); // Scan in iterations
		double pi = 0; // Declare pi now as 0 as i starts as 0.
		long timeNow = System.currentTimeMillis();
		
		for (int i = 0; i < n; i++) {
			pi += (double)((Math.pow(-1, i)) / ((2 * i) + 1));
		}
		
		long timeAfter = System.currentTimeMillis();
		pi = pi * 4; // Since the output is pi/4, multiply by 4
		System.out.println("PI = " + pi + "\nAfter " + n + " iterations.\nThis operation took " + (timeAfter - timeNow) + " milliseconds to complete.");
		input.close();
	}
}

