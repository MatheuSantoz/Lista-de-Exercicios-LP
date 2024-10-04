/*
 * Ex22.java
 * Matheus Augusto dos Santos
 */

import java.util.Scanner;
public class Ex22 {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine().trim().toUpperCase();
		System.out.print("Palavra a ser encontrada: ");
		String palavra = leia.nextLine().trim().toUpperCase();
		int contador = 0;
		for (int i = 0; i <= frase.length() - palavra.length(); i++) {
			char x = frase.charAt(i);
			if (frase.substring(i, i + palavra.length()).equals(palavra)) {
                contador++;
            }
			}
		System.out.print(contador);
	}
}

