/*
 * Ex21.java
 * Matheus Augusto dos Santos
 */

import java.util.Scanner;
public class Ex21 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		String frase = letras.nextLine();
		
		String[] palavras = frase.split(" ");
		String guardaTudo = "";
		
		System.out.print("Frase completa: ");
		for (int i = 0; i < palavras.length; i++) {
			guardaTudo += palavras[i];
			}
		System.out.print(guardaTudo);
	}
}

