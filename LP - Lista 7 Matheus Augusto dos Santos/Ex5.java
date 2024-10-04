/*
 * Ex5.java
 * MAtheus Augusto dos SAantos
 * 
 */

import java.util.Scanner;
public class Ex5 {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String frase = "";
		int contador = 0;
		System.out.print("Escreva uma frase ou palavra: ");
		frase = leia.nextLine().toUpperCase().trim();
	// percorre todas as letras da frase
		for (int i = 0; i < frase.length(); i++) {
			char guardaFrase = frase.charAt(i);
			guardaFrase = guardaFrase;
			if (guardaFrase ==  'A') {
				contador++;
				}
			}
		System.out.printf("\nA letra 'a' foi utilizada %d vezes.", contador);
	}
}

