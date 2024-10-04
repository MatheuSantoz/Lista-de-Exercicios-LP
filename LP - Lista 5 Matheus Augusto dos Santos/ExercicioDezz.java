/*
 * ExercicioDezz.java
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
public class ExercicioDezz {
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		double salario, valorVenda, comissao, comissao2;
		
		System.out.print("Salario total: ");
		salario = leia.nextDouble();
		
		System.out.print("Valor das vendas: ");
		valorVenda = leia.nextDouble();
		if (valorVenda >= 1500) {
			comissao = valorVenda * 0.3;
			comissao2 = (valorVenda - 1500) * 0.5;
			System.out.println("Salario normal: R$" + salario);
			System.out.println("Valor das vendas: R$" + valorVenda);
			System.out.println("----------------------------------");
			System.out.println("Novo salario: R$" + ( (salario + comissao) + comissao2) );
			System.out.println("Total de comissoes: " + (comissao+comissao2));
			} else {
			comissao = valorVenda * 0.3;
			System.out.println("Salario normal: R$" + salario);
			System.out.println("Valor das vendas: R$" + valorVenda);
			System.out.println("----------------------------------");
			System.out.println("Novo salario: R$" + (salario + comissao));
			System.out.println("Total de comissoes: " + comissao);
				}
		
		
		
		
		
	}
}

