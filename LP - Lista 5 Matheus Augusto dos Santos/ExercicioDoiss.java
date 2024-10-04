/*
 * ExercicioDoiss.java
 * 
 */

import java.util.Scanner; 
public class ExercicioDoiss {
	
	public static void main (String[] args) {
		Scanner numero = new Scanner ( System.in );
		int num;
		
		System.out.print("Digite um número: ");
		num = numero.nextInt();
		
		if (num >= 0) {
			System.out.println("Numero: " + num + " é positivo");
			} else {
				System.out.println("Numero: " + num + " é negativo");
				}
	}
}

