/*
 * Ex24.java
 * 
 * Copyright 2024 matheus <matheus@DESKTOP-EKFSJ3G>
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


public class Ex24 {
	
	public static void main (String[] args) {
		for (int i = 1; i <=10; i++) {
			for (int x = 0; x <= 10; x++) {
				System.out.println(String.format("%d * %d = %d", i, x, (x * i)));
				}
			System.out.println("----------------------");
			}
	}
}

