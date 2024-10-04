/*
 * Ex17.java
 * Matheus Augustp dos Santos
 */

import java.util.Scanner;
public class Ex17 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		System.out.print("Digite a primeira frase: ");
		String fraseUm = letras.nextLine();
		System.out.print("Digite a segunda frase: ");
		String fraseDois = letras.nextLine();
		int contador = 0;
		
		for (int i = 0; i < fraseUm.length(); i++) {
			char x = fraseUm.charAt(i);
			for (int j = 0; j < fraseDois.length(); j++) {
				char y = fraseDois.charAt(j);
				if (x == y) {
					contador++;
					}
				}
			}
		if (contador == fraseUm.length()) {
			System.out.println("As duas frases sao iguais.");
			} else {
				System.out.println("As duas frases sao diferentes.");
				}
				
	}
}

