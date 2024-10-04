/*
 * Ex18.java
 * Matheus Augusto dos Santos
 */
import java.util.Scanner;
public class Ex18 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		System.out.print("Verificar sequencia: ");
		String frase = letras.nextLine();
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			char x = frase.charAt(i);
			if (frase.length() == 8) {
				if (x == '0' | x == '1') {
				contador++;		
					}
				}
			
			}
		if (frase.length() == contador) {
			System.out.printf("SIM eh uma sequencia de 8 bit's: %s", frase);
			} else { 
				System.out.printf("NAO eh uma sequencia de 8 bit's: %s", frase);
				}
	}
}

