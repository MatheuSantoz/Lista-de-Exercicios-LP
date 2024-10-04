/*
 * ExercicioQuatro.java
 * 
 * Copyright 2024 Aluno <Aluno@GHPEDI5047>
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

public class ExercicioQuatro {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		double n1, n2, res;
		String situacao = "";
		boolean cond = false;
		
		
		do {
		System.out.print("Digite a nota 1: ");
		n1 = leia.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		n2 = leia.nextDouble();	
		
		if (n1 <= 10 && n1 >= 0 && n2 <= 10 && n2 >= 0) {
			cond = true;
			}
			
		} while (cond == false);
		
		res = (n1 + n2) / 2;
		
		if (res >= 6 ) {
			situacao = "Aprovado!";
			} else {
			situacao = "Reprovado!";
				}
		System.out.println("---------------------" + 
						 "\nNota 1: " + n1 + 
						 "\nNota 2: " + n2 + 
						 "\nMedia: " + res +
						 "\nSituacao: " + situacao);
		
		 
	}
}

