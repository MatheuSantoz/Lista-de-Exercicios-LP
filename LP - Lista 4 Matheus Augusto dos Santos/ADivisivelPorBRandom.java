/*
 * ADivisivelPorBRandom.java
 * Matheus Augusto dos Santos
 * 
 */


public class  ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 20);
		
		if (a % b == 0) {
		System.out.println("E divisivel");
		System.out.println("Valor A: " + a + "\nValor B: " + b);
		} else {
			System.out.println("Nao e divisivel");
			System.out.println("Valor A: " + a + "\nValor B: " + b);
			}
	}
}

