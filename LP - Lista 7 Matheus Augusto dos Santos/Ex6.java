/*
 * Ex6.java
 * Matheus Augusto dos Santos
 */

import java.util.Scanner;
public class Ex6 {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String caracterFornecido = "", frase = "";
		int contador = 0;
		System.out.print("Qual caracter vc deseja verificar: ");
		caracterFornecido = leia.nextLine().toUpperCase();
		System.out.print("Digite uma frase: ");
		frase = leia.nextLine().toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			char guardaChar = frase.charAt(i);
			if (String.valueOf(guardaChar).equals(caracterFornecido)) {
				contador++;
				}
			}
		System.out.printf("\nA letra de verificacao eh %s e a frase digitada foi %s.\nA letra %s apareceu %d vezes.", caracterFornecido, frase, caracterFornecido, contador);
	}
}

