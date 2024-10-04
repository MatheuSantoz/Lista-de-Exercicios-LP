/*
 * ExercicioNove.java
 * 
 * Matheus AUgusto dos SAntos
 * 
 */

import java.util.Scanner;
public class ExercicioNove{
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		double horasTrabalhadas, salarioPorHora, salarioTotal, apoio=0, apoio2=0, salarioTotal2;
		
		System.out.print("Horas trabalhadas no mes: ");
		horasTrabalhadas = leia.nextDouble();
		
		System.out.print("Salario por hora: R$");
		salarioPorHora = leia.nextDouble();
		
		salarioTotal = (salarioPorHora * 8) * 30;
		System.out.println("Salario Total: R$" + salarioTotal);
		
		if (horasTrabalhadas > 40) {
			
			apoio2 =  horasTrabalhadas - 40;
			apoio = salarioPorHora + (salarioPorHora * 0.5);
			salarioTotal2 = (apoio * apoio2) + salarioTotal;
			System.out.println("------------------------------------------------");
			System.out.println("Quantidade de horas extras: " + (int)apoio2 +
								"\nNovo valor de horas trabalhadas: R$" + apoio + 
								"\nNovo salário: R$" + salarioTotal2);
			
			}
	}
}

