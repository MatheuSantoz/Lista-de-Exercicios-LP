/*
 * VerificaValorProduto.java
 * Matheus Augusto dos Santos
 * 
 */

import java.util.Scanner;
public class VerificaValorProduto {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		double precoProduto1, precoProduto2;
		
		System.out.print("Digite o preco do produto 1: ");
		precoProduto1 = leia.nextDouble();
		
		if (precoProduto1 > 1000) {
			System.out.println("VALOR INVALIDO");
			} else {
				System.out.print("Digite o preco do produto 2: ");
				precoProduto2 = leia.nextDouble();
				if (precoProduto2 > 1000) {
					System.out.println("VALOR INVALIDO");
					} else {
						if (precoProduto1 < precoProduto2) {
							System.out.println("O produto 1 é o mais barato");
							} else if (precoProduto2 < precoProduto1) {
								System.out.println("O produto 2 é o mais barato");
								} else {
									System.out.println("Os precos dos dois produtos sao iguais");
									}
						}
				}
		
		
		
	}
}

