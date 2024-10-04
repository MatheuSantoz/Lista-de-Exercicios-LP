/*
 * Ex19.java
 * 
 * Matheus AUgusto dos Santos
 * 
 */

import java.util.Scanner;
public class Ex19 {
	public static void main (String[] args) {
		Scanner num = new Scanner (System.in);
		Scanner letras = new Scanner (System.in);
		String res = "";
		int contagem = 1;
		double valor = 0, soma = 0;
		boolean ok = true;
		
		
		do {
			System.out.print(String.format("Digite o valor da %dº mercadoria:  ",contagem));
			valor = num.nextDouble();
			
			System.out.print("Deseja adicionar mais uma mercadoria? (S/N): ");
			res = (letras.nextLine()).toUpperCase();
			soma += valor;
			if (res.equals("S")) {
				contagem++;
				ok = true;
				} else {
					ok = false;
					}
					
			} while (ok);
			
			System.out.println(String.format("--------------------------\n" +
											 "Quantidade de mercadorias: %s" + 
											 "\nValor total de mercadorias: R$%s" + 
											 "\nMedia das mercadorias: R$%s",contagem,soma,(soma/contagem)));
	}
}

