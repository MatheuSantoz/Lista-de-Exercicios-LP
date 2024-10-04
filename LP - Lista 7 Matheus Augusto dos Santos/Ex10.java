/*
 * Ex10.java
 * Matheus Augusto dos Santos
 */

import java.util.Scanner;
public class Ex10 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		int contador = 0;
		System.out.print("Digite uma frase: ");
		String frase = letras.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			char ver = frase.charAt(i);
			/* int num = (int) ver;
			if (num >= 65 & num <= 90) {
				contador++;
				}
				*/
				// ou
			if (Character.isUpperCase(ver)) {
				contador++;
				}
			}
		System.out.printf("Existem %d letras maiusculas nessa frase.", contador);
	}
}

