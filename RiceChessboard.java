/*
 * RiceChessboard.java
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

public class RiceChessboard {
	
	public static void main(String[] args) {
		double n = 0;
		int m = 0;
		for (int i = 1; i <= 64; i++) {
			n += (Math.pow(2, m)); // Since this essentially boils down to an exponential equation, I'll just leave it like this
			m++;
		}
		System.out.println("There are " + n + " rice grains on the chessboard.");
	}
}

