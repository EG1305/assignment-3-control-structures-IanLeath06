/*
 * PINCheck.java
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

public class PINCheck {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your PIN");
		int PIN = input.nextInt();
		System.out.println("Please confirm your PIN");
		for(;;) { // Theres probably a better way of doing this but this is pretty simple so I don't really care
			int PINconf = input.nextInt();
			if (PINconf == PIN) {
				System.out.println("PIN confirmed. You may now access your account.");
				break; // Since break can be used in a for loop without any issue, I'll just use it here
			} else System.out.println("Wrong PIN. Please try again.");
		}
		
		input.close();
	}
}

