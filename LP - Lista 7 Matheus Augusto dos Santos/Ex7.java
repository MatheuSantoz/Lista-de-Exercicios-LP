/*
 * Ex7.java
 * Matheus Augusto dos Santos
 */

import java.util.Scanner;
public class Ex7 {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String frase = "";
		int contador;
		System.out.print("Digite uma frase: ");
		frase = leia.nextLine().toUpperCase();
		
		for (int i = 65; i <= 90; i++) {
			contador = 0;
			char alfabeto = (char) i;
			for (int j = 0; j < frase.length(); j++) {
				char guardaLetra = frase.charAt(j);
				
				if (guardaLetra == alfabeto) {
					contador++;
					}
					
				}
			System.out.printf("\n%s - %d", alfabeto, contador);
			}
	}
}

