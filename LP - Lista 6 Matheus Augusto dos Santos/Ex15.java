/*
 * Ex15.java
 *Matheus Augusto dos Santos
 * 
 * 
 */

import java.util.Scanner;
public class Ex15 {
	
	public static void main (String[] args) {
		Scanner numeros = new Scanner (System.in);
		double num=0, n2=0;
		int contagem = 1, soma = 0;
		
		while (contagem <= 2) {
			System.out.print(String.format("Digite o %dº numero: ", contagem));
			num = numeros.nextDouble();
			if (num % 1 == 0) {
				soma += num;
				}
			if (contagem == 1) {
				n2 = num;
				}
			contagem++;
			}
		if (soma == 0) {
			System.out.println(String.format("Os numeros digitados foram: %s e %s", n2,num));
			} else {
				System.out.println(String.format("Os numeros digitados foram: %s e %s" +
												 "\nSoma dos inteiros: %s", n2,num,soma));
				}
	}
}

