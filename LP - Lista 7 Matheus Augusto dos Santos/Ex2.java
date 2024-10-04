/*
 * Ex2.java
 * Matheus Augusto dos Santos
 * 
 */


public class Ex2 {
	
	public static void main (String[] args) {
		String vazia = "", modificado = "";
		int x = 0;
	// Imprimi o alfabeto.
		for (int i = 65; i <= 90; i++) {
			x++;
			vazia = Character.toString((char) i);
			System.out.print(vazia + " - ");
			System.out.print(vazia.replace("" + (char) i, "" + (char) x) + "\n");
		}
	}
}

