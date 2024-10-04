/*
 * AprovadoReprovadoRandom.java
 * Matheus Augusto dos Santos
 */


public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		double num = (int)(Math.random() * 10);
		if (num >= 6) {
			System.out.println("Nota: " + num + "\nSituacao: Aprovado!");
			} else {
			System.out.println("Nota: " + num + "\nSituacao: Reprovado!");
				}
	}
}

