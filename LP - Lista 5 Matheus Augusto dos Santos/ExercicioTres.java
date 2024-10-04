/*
 * ExercicioTres.java
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
public class ExercicioTres {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		int macaVendidas;
		double conta;
		
		System.out.print("Quantas macas foram vendidas: ");
		macaVendidas = leia.nextInt();
		
		if (macaVendidas >= 12) {
			conta = macaVendidas * 1;
			System.out.println("Quanidade vendidas: " + (int) (macaVendidas) +
							 "\nTotal a pagar: R$ " + conta);
			} else {
				conta = macaVendidas * 1.3;
			System.out.println("Quanidade vendidas: " + macaVendidas +
							 "\nTotal a pagar: R$ " + conta);
				}
				
				
	}
}

