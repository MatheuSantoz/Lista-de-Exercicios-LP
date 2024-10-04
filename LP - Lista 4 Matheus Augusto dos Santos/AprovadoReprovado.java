/*
 * AprovadoReprovado.java
 * Matheus Augusto dos Santos
 *  
 */

import java.util.Scanner;
public class AprovadoReprovado {
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		double nota;
		System.out.print("Digite a nota: ");
		nota = leia.nextDouble();
		if (nota >= 0 && nota <=10) {
			if (nota >= 6) {
				System.out.println("APROVADO");
				} else {
					System.out.println("REPROVADO");
					}
		} else {
			System.out.println("VALOR INVALIDO");
			}
		
	}
}

