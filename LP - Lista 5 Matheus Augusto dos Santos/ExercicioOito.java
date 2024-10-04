/*
 * ExercicioOito.java
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
public class ExercicioOito {
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		int horaInicio, horaFim, guardarHora=0;
		
		System.out.print("inicio do jogo: ");
		horaInicio = leia.nextInt();
		System.out.print("fim do jogo: ");
		horaFim = leia.nextInt();
		
		if (horaInicio == horaFim && horaFim == horaInicio) {
			System.out.println("O jogo durou 24 horas!");
			} else if (horaFim > horaInicio) {
			guardarHora =  (horaFim + horaInicio) - 24;
			System.out.print("O jogo durou: " + guardarHora + " horas.");
				} else if (horaInicio > horaFim) {
			guardarHora = (horaFim + horaInicio) - 24;
			System.out.print("O jogo durou: " + guardarHora + " horas.");
				} else {
					System.out.print("O jogo n pode durar mais que 24 horas");			
					}
				
				
		
		
		
	}
}

