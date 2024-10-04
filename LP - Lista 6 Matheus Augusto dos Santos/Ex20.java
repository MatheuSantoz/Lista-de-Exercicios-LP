/*
 * Ex20.java
 * 
 Matheus Augusto dos Saqntntos
 * 
 * 
 */

import java.util.Scanner;
public class Ex20 {
	public static void main (String[] args) {
		Scanner num = new Scanner (System.in);
		double m = {};
		for (int i = 1; i <=100; i++) {
			 m = Math.random() * 100;
			System.out.print(String.format("%dº numero: %s\n", i,m));
			
			}
		
	}
}

