/*
 * Ex23.java
 * Matheus Augusto dos Santos
 * 
 */
import java.util.Scanner;
public class Ex23 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		System.out.print("Digite seu nome completo: ");
		String frase = letras.nextLine();
		String[] tamanho = frase.split(" ");
		int ultimo = tamanho.length - 1;
		System.out.print(tamanho[ultimo].toString());
	}
}

