/*
 * Ex18.java
 * 
 * Matheus AUgusto dos SAntos
 * 
 * 
 */

import java.util.Scanner;
public class Ex18 {
	public static void main (String[] args) {
		Scanner num = new Scanner (System.in);
		int numeroTotal = 0;
		double valorCada, soma = 0;
		
		while (numeroTotal == 0) {
		System.out.print("o número total de mercadorias no estoque: "); 
		numeroTotal = num.nextInt();
	}
	System.out.println("------------------");
	for (int i = 1; i <= numeroTotal; i++) {
		System.out.print(String.format("Digite o valor da %dº mercadoria: ",i));
		valorCada = num.nextDouble();
		soma += valorCada;
		}
	System.out.println(String.format("----------------------\nValor total de mercadorias: %s" + 
									 "\nMedia total das mercadorias: %s",soma, (soma / numeroTotal)));
	}
}

