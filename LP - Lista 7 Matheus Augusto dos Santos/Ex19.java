/*
 * Ex19.java
 * Matheus Augusto dos Santos
 */
 import java.util.Scanner;
public class Ex19 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = letras.nextLine();
		StringBuffer fraseReverse = new StringBuffer(frase);
		
		if (frase.equals(fraseReverse.reverse().toString())) {
			System.out.println("A palavra SIM eh palindromo");
			}else {
				System.out.println("A palavra NAO eh palindromo");
				}
			
	}
}

