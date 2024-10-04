/*
 * Ex11.java
 *
 * 
 * 
 */

import java.util.Scanner;
public class Ex11 {
	public static void main (String[] args) {
		Scanner num = new Scanner (System.in);
		int qtndAluno, qntdNotas = 0, cont = 1;
		boolean ver = true;
		
		
		System.out.print("Quantidade de alunos: ");
		qtndAluno = num.nextInt();
		
		if (qtndAluno > 0) {
		qntdNotas = num.nextInt();
			do {
				System.out.println(String.format("%dº Aluno", cont));
				
				if (cont == qtndAluno) {
					ver = false;
					} 
					cont++;
				}while (ver == true);
				
			} else {
				System.out.print("Quantidade invalida!");
				}
		
		
	}
}

