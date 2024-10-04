/*
 * ExercicioUm.java
 */

import java.util.Scanner;
public class ExercicioUm {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int x;
		
		System.out.print("Digite um número: ");
		x = leia.nextInt();
		
		if(x > 10) {
			System.out.println("É MAIOR QUE 10!");
			}  else {
				System.out.println("NÃO É MAIOR QUE 10!");
				}
	}
}

