/*
 * Ex13.java
 * Matheus Augusto dos Santos
 */

import java.util.Scanner;
public class Ex13 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		String frase = letras.nextLine().toUpperCase();
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			switch (frase.charAt(i)) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					break;
				default:
				contador++;
					break;
				}
			}
			System.out.printf("A frase possui %d consoantes.", contador);
	}
}

