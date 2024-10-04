/*
 * ExercicioSeis.java
 * 
 * MAtheus AUgusto dos Santos
 */

import java.util.Scanner;
public class ExercicioSeis {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int a,b;
		boolean cond = true;
		
		do {
			System.out.print("Digite o num A: ");
			a = leia.nextInt();
		
			System.out.print("Digite o num B: ");
			b = leia.nextInt();
			
			if (a == b) {
				cond = true;
				System.out.println("numeros iguais nao serao aceitos");
				} else {
					cond = false;
					}
			} while (cond == true);
			
			if (a > b) {
				System.out.println("O maior numero digitado foi: " + a);
				} else {
					System.out.println("O maior numero digitado foi: " + b);
					}
		
		
	}
}

