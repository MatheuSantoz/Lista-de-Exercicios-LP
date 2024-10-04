/*
 * Ex29.java
 * 
 * 
 * 
 */


public class Ex29 {
	
	public static void main (String[] args) {
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d, ", i);
			for (int x = 1; x <=10; x++) {
				if (i % 2 == 0 && x % 2 == 0) {
					System.out.printf("%d ", x);
					} else if (i % 2 == 1 && x % 2 == 1) {
					System.out.printf("%d ", x);
					}
				}
			System.out.println();
			}
	}
}

