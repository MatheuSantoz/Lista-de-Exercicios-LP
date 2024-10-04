/*
 * Ex24.java
 * Matheus Augusto dos Santos
 * 
 */
import java.util.Scanner;
public class Ex24 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		String frase = "";
		int sequenciaAtual = 0, sequenciaMax = 0;
		boolean cond = true;
		do {
			System.out.print("Digite uma frase: ");
			frase = letras.nextLine();
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == 48 | frase.charAt(i) ==  49) {
						if (frase.charAt(i) == 49){
							sequenciaAtual++;
								if (sequenciaAtual > sequenciaMax) {
									sequenciaMax++;
									}
							} else {
								sequenciaAtual = 0;
								}
					cond = false;
					} else {
						System.out.println("Use 1 ou 0!!");
						cond=true;
						}
				}
			} while (cond);
			System.out.printf("A maior sequencia de 1 foi %d digitos seguidos.", sequenciaMax);
	}
}

