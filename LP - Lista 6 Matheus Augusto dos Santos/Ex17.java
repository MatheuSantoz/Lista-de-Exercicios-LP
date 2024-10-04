/*
 * Ex17.java
 * 
 * Matheus Augusto dos Santos
 * 
 * 
 */
import java.util.Scanner;
import java.util.*;

public class Ex17 {
	public static void main (String[] args) {
		Scanner numeros = new Scanner(System.in);
		Scanner letras = new Scanner (System.in);
		String resposta = "";
		double n1 = 0, n2 = 0, media = 0;
		boolean ok = true, verNota = true;
		
		// Inicia o laço
		do {
			verNota = true;
			// cria um laço para verificar se a nota 1 é maior que 10 ou menor que 0.
			while (verNota == true) {
				System.out.print("Digite a primeira nota: ");
				n1 = numeros.nextDouble();
				if (n1 <= 10 && n1 >= 0) {
					verNota = false;
					} else {
					verNota = true;
						}
				}
				
				verNota = true;
			// cria um laço para verificar se a nota 2 é maior que 10 ou menor que 0.
			while (verNota == true) {
				System.out.print("Digite a segunda nota: ");
				n2 = numeros.nextDouble();
				if (n2 <= 10 && n2 >= 0) {
					verNota = false;
					} else {
						verNota = true;
						}
				}
				media = (n1 + n2) / 2;
			System.out.println(String.format("-------------------\nNota 1: %s\nNota 2: %s\nMedia: %s\n-------------------", n1,n2,media));
			System.out.print("\nDeseja iniciar o programa novamente? (S/N): ");
			resposta = letras.nextLine();
			
			switch (resposta) {
				case "S":
				case "s":
				case "sim":
					media = 0;
					ok = false;
					break;
				case "N":
				case "n":
				case "nao":
					ok = true;
					break;
				}
					
			} while (ok == false);
			
		System.out.print("Programa finalizado!");
		
	}
}

