/*
 * Ex14.java
 * Matheus Augusto dos Santos
 * 
 * 
 */

import java.util.Scanner;

public class Ex14 {
	public static void main (String[] args) {
		Scanner num = new Scanner(System.in);
		double soma = 0, n1, n2;
		boolean ok = true;
		
		System.out.print("Insira o primeiro numero: ");
		n1 = num.nextDouble();
		
		do {
			System.out.print("Insira o segundo numero: ");
			n2 = num.nextDouble();
			if (n2 < n1) {
				ok = false;
				System.out.println("O segundo numero deve ser maior que o primeiro. Tente novamente!");
				} else {
					ok = true;
					}
			} while (ok == false);
		
		if (n1 % 1 == 0 & n2 % 1 == 0) {
				soma = n1 + n2;
				} else if (n1 % 1 == 0) {
					soma += n1;
				} else if (n2 % 1 == 0) {
					soma+= n2;
						}  
			
		if (soma == 0) {
			System.out.println(String.format("Os numeros digitados foram: %s e %s", n1, n2));
			} else {
				System.out.println(String.format("Os numeros digitados foram: %s e %s" + 
											   "\nA soma dos numeros inteiros sao: %s", n1, n2,soma));
				}
		
	}
}

