/*
 * ExercicioSete.java
 * 
 * Copyright 2024 Aluno <Aluno@GHPEDI5056>
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
public class ExercicioSete {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		int a,b;
		boolean cond = true;
		
		do {
			System.out.print("Digite o num A: ");
			a = leia.nextInt();
			System.out.print("Digite o num B: ");
			b = leia.nextInt();
			if (a == b) {
				cond = false;
				System.out.println("os numeros n podem ser iguais");
				} else {
					cond = true;
					}
			} while (cond == false);
		if (a > b) {
			System.out.println("Crescente: " + b + " e " + a + ".");
			} else {
			System.out.println("Crescente: " + a + " e " + b + ".");
				}
	}
}

