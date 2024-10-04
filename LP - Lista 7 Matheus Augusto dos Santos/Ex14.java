/*
 * Ex14.java
 * Matheus August dos Santos
 */
import java.util.Scanner;
public class Ex14 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		String frase = letras.nextLine().toUpperCase();
		
		String teste = "";
		
		System.out.print("Digite um caracter: ");
		String carac = letras.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			char x = frase.charAt(i);
			if (String.valueOf(x).equals(carac)) {
				teste = frase.replace(x, '*');
				}
			}
		System.out.print(teste);
	}
}

