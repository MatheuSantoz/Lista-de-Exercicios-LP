/*
 * Ex9.java
 * NMatheus Augusto dos Santos Silva
 */
import java.util.Scanner;
public class Ex9 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		String frase = "";
		int espaco = 0;
		System.out.print("Digite uma frase: ");
		frase = letras.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			char espacoBranco = ' ', letra = frase.charAt(i);
			if (letra == espacoBranco) {
				espaco++;
				}
			}
		System.out.printf("Voce utilizou %d espacos para esta frase.", espaco);
	}
}

