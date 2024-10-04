/*
 * Ex25.java
 * Matheus Augusto dos Santos
 */

import java.util.Scanner; 
public class Ex25 {
	public static void main (String[] args) {
		Scanner letras = new Scanner (System.in);
		System.out.print("Digite sua senha: ");
		String senha = letras.nextLine();
		int contadorLetras = 0, contadorNumeros = 0, contadorSimbolos = 0;
		String statusTamanho = "", statusLetras = "", statusSimbolos = "", statusNumeros = "";
		for (int i = 0; i < senha.length(); i++) {
			if (Character.isLetter(senha.charAt(i))) {
				contadorLetras++;
				}
			if (Character.isDigit(senha.charAt(i))) {
				contadorNumeros++;
				} else if (senha.charAt(i) >= 33 & senha.charAt(i) <= 64) {
					contadorSimbolos++;
				}
			}
			if (contadorLetras >= 3) {
				statusLetras = "ok";
				} else {
					statusLetras = "x";
					}
			if (senha.length() >= 10) {
				statusTamanho = "ok";
				} else {
					statusTamanho = "x";
					}
			if (contadorNumeros >= 3) {
				statusNumeros = "ok";
				} else {
					statusNumeros = "x";
					}
			if (contadorSimbolos >= 2) {
				statusSimbolos = "ok";
				} else {
					statusSimbolos = "x";
					}
		System.out.printf("--- REGRAS ---" +
						 "\nTamanho 10: %d (%s)" +
						 "\nLetras 3: %d (%s)" + 
						 "\nNumeros 3: %d (%s)" + 
						 "\nSimbolos 2: %d (%s)\n\n", senha.length(),statusTamanho, contadorLetras,statusLetras, contadorNumeros,statusNumeros, contadorSimbolos,statusSimbolos);
		if (statusLetras == "ok" && statusTamanho == "ok" && statusNumeros == "ok" && statusSimbolos == "ok") {
			System.out.println("Senha Aprovada! Parabens!");
			} else {
				System.out.println("Senha Reprovada! Tente novamente.");
				}
	}
} 

