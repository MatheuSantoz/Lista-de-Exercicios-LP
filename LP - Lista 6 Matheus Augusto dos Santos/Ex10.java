/*
 * Ex10.java
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
public class Ex10 {
	public static void main (String[] args) {
		Scanner num = new Scanner (System.in);
		int cont = 1;
		double n, soma = 0, media;
		
		do {
			System.out.print(String.format("Digite o %dº numero: ",cont));
			n = num.nextDouble();
			soma+=n;
			cont++;
			} while (cont <= 10);
			
		media = soma / 10;
		System.out.println(String.format("A média aritmedica de %.1f e %.1f",soma,media));
		
		
	}
}

