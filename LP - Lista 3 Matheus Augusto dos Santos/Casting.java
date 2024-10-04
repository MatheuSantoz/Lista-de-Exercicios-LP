/*
 * Casting.java
 * 
 * Matheus Augusto dos Santos
 * 
 */


public class Casting {
	
	public static void main (String[] args) {
		Long numero1 = 2147483648l;
		int numero2 = numero1.intValue();
		
		System.out.println(numero2);
		System.out.println(numero1);
	}
}

