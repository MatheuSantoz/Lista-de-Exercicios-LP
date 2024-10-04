/*
 * Ex20.java
 * Matheus Augusto dos Santos
 * 
 */

import java.util.Scanner;
public class Ex20 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		String frase = letras.nextLine();
		String[] palavras = frase.split(" ");
		
		System.out.print("A frase possui " + palavras.length + " palavras.");
	}
}

