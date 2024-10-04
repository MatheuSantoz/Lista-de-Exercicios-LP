/*
 * ExercicioCinco.java
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

import java.util.Scanner;
public class ExercicioCinco {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		int anoAtual, anoNasc, res;
		
		System.out.print("Digite o ano atual: ");
		anoAtual =  leia.nextInt();
		
		System.out.print("Digite o ano de nascimento: ");
		anoNasc =  leia.nextInt();
		
		res = anoAtual - anoNasc;
		
		if (res >= 16) {
			System.out.print( "Idade: " + res + " anos." + "\nPode votar!");
			} else {
				System.out.print( "Idade: " + res + " anos." + "\nNão pode votar!");
				}
	}
}

