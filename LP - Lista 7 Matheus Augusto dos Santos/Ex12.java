/*
 * Ex12.java
 * Matheus August0o dos Santos
 */
import java.util.Scanner;
public class Ex12 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		String frase = letras.nextLine().toUpperCase();
		int[] contadorVogal = new int[5];
		
		for (int i = 0; i < frase.length(); i++) {
			char x = frase.charAt(i);
			switch (x) {
				case 'A':
				contadorVogal[0]++;
					break;
				case 'E':
				contadorVogal[1]++;
					break;
				case 'I':
				contadorVogal[2]++;
					break;
				case 'O':
				contadorVogal[3]++;
					break;
				case 'U':
				contadorVogal[4]++;
					break;
				default:
					break;
				}	
			}
		System.out.printf("A - %d\nE - %d\nI - %d\nO - %d\nU - %d", contadorVogal[0],contadorVogal[1],contadorVogal[2],contadorVogal[3],contadorVogal[4]);
	}
}

