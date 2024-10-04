/*
 * Ex8.java
 * Matheus Augusto dos Santos
 */

import java.util.Scanner;
public class Ex8 {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int contador;
		String frase = "";
		System.out.print("Digite uma frase: ");
		frase = leia.nextLine().toUpperCase();
		
		for (int i = 65; i<= 90; i++) {
			contador = 0;
			char alfabeto = (char) i;
			for (int j = 0; j < frase.length(); j++) {
				char guardaLetra = frase.charAt(j);
				if (alfabeto == guardaLetra) {
					contador++;
					}
				}
			if (contador >= 1) {
				System.out.printf("%s - %d\n", alfabeto, contador);
				}
			}
	}
}

