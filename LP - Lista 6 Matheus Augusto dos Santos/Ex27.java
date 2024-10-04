/*
 * Ex27.java
 * 
 * 
 */


public class Ex27 {
	public static void main (String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d, ",i);
			for (int x = 1; x <= 10 - (i - 1); x++) {
				System.out.printf("%d ", x);
				}
			System.out.println();
			}
	}
}

