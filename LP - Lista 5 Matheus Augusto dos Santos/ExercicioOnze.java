/*
 * ExercicioOnze.java
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
public class ExercicioOnze {
	public static void main (String[] args) {
		Scanner operacao = new Scanner ( System.in );
		Scanner num = new Scanner ( System.in );
		
		double a,b, conta = 0;
		String operacao1 = "";
		
		System.out.print("Digite o primeiro num: ");
		a = num.nextDouble();
		
		System.out.print("Digite o segundo num: ");
		b = num.nextDouble();
		
		System.out.print("Qual operacao deseja fazer(+, -, / e *): ");
		operacao1 = operacao.nextLine();
		char operador = operacao1.charAt(0);
		
		switch (operador) {
			case '+' :
				conta = a + b;
				System.out.print(a + " + " + b + " = " + conta);
				break;
			case '-':
				conta = a - b;
				System.out.print(a + " - " + b + " = " + conta);
				break;
			case '/':
				conta = a / b;
				System.out.print(a + " +/ " + b + " = " + conta);
				break;
			case '*':
				conta = a * b;
				System.out.print(a + " * " + b + " = " + conta);
				break;
			default:
				System.out.println("Operacao nao encontrada!");
				break;
			}
	}
}

