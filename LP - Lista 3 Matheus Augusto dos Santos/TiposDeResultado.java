/*
 * TiposDeResultado.java
 * 
 * Matheus Augusto dos Santos
 * 
 * 
 */


public class TiposDeResultado {
	
	public static void main (String[] args) {
		byte a = 1;
		short b = 2;
		double c = 3.14;
		
		short d = (short)(a + b);
		float e = (float)(b + c);
		
		System.out.println(d);
		System.out.println(e);
	}
}

