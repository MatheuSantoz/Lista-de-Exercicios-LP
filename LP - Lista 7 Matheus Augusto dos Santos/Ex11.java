/*
 * Ex11.java
 * MAtheus Augusto dos SAntos
 */
import java.util.Scanner;
public class Ex11 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		int contadorLetra = 0, contadorNumerico = 0;
		System.out.print("Digite uma frase: ");
		String frase = letras.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			char fraseSeparada = frase.charAt(i);
			if (Character.isLetter(fraseSeparada)) {
				contadorLetra++;
				} else if (Character.isDigit(fraseSeparada)) {
					contadorNumerico++;
					}
			}
		System.out.printf("A frase possui %d letras e %d numeros.", contadorLetra, contadorNumerico);
	}
}

