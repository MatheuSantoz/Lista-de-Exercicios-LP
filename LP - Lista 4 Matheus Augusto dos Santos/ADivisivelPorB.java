/*
 * ADivisivelPorB.java
 * Matheus Augusto dos Santos
 *  
 */

import java.util.Scanner;
public class ADivisivelPorB {
	
	public static void main (String[] args) {
		int a,b,x;
		Scanner leia = new Scanner ( System.in );
		
		System.out.print("Digite o valor de a: ");
		a = leia.nextInt();
		
		if (a > 1000 | a < 0) { 
			System.out.print("Numero invalido");
			} else {
				System.out.print("Digite o valor de b: ");
				b = leia.nextInt();
				if (b < 0 | b > 20) {
					System.out.print("Numero invalido");
					} else {
						if (b > a) {
							x = a;
							a = b;
							b = x;
							}
						if (a % b == 0) {
							System.out.print("E DIVISIVEL");
							} else {
							System.out.print("NAO E DIVISIVEL");
								}
						}
				}
				
		
	}
}

