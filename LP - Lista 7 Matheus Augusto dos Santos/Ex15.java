/*
 * Ex15.java
 * Matheus Augusto dos Sanntos
 */

import java.util.Scanner;
public class Ex15 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		String frase = letras.nextLine();
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			char x = frase.charAt(i);
			if (Character.isDigit(x)) {
				contador++;
				}
			}
		if (contador <= 0) {
			System.out.print("Nao possui caracter numerico na frase.");
		} else {
			System.out.printf("possui %d caracteres numericos nessa frase.", contador);
			}
	}
}

