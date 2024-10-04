/*
 * Ex16.java
 * Matheus Augusto dos Santos * 
 * 
 */
import java.util.Scanner;
public class Ex16 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		int contador = 0;
		System.out.print("Digite uma frase: ");
		String frase = letras.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isUpperCase(frase.charAt(i))) {
				contador++;
				}
			}
		if (contador <= 0) {
			System.out.println("Nao existe letras maiusculas.");
			} else {
				System.out.printf("A frase possui %d letras maiusculas.", contador);
				}
	}
}

