/*
 * ExercicioDoze.java
 * 
 */

import java.util.Scanner;
public class ExercicioDoze {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		int a;
		double c,b,d;
		System.out.print("Digite o codigo do produto: ");
		a = leia.nextInt();
		
		System.out.print("Digite o preco do produto: ");
		b = leia.nextDouble();
		
		switch ( a ) {
			case 1:
				c = b * 0.1;
				d = c + b;
				System.out.printf(String.format("\n------------------\n" + "\nRegiao: Norte\nValor produto: R$%.2f" + "\nFrete: R$%.2f" + "\nTotal: R$%.2f", b,c,d));
				break;
			case 2:
			case 5:
			case 9:
				c = b * 0.03;
				d = c + b;
				System.out.printf(String.format("\n------------------\n" + "\nRegiao: Sul\nValor produto: R$%.2f" + "\nFrete: R$%.2f" + "\nTotal: R$%.2f", b,c,d));
				break;
			case 3:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				c = b * 0.012;
				d = c + b;
				System.out.printf(String.format("\n------------------\n" + "\nRegiao: Leste\nValor produto: R$%.2f" + "\nFrete: R$%.2f" + "\nTotal: R$%.2f", b,c,d));
				break;
				
			case 7:
			case 20:
				c = b * 0.073;
				d = c + b;
				System.out.printf(String.format("\n------------------\n" + "\nRegiao: Oeste\nValor produto: R$%.2f" + "\nFrete: R$%.2f" + "\nTotal: R$%.2f", b,c,d));
				break;
			default:
				c = b * 0.222;
				d = c + b;
				System.out.printf(String.format("\n------------------\n" + "\nRegiao: Importado\nValor produto: R$%.2f" + "\nFrete: R$%.2f" + "\nTotal: R$%.2f", b,c,d));
				break;
			}
		
		
	}
}

