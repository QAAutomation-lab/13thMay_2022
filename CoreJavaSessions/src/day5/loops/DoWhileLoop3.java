package day5.loops;

public class DoWhileLoop3 {

	public static void main(String args[]) {
		/* local variable Initialization */ 
		int n = 5, times = 0;

		/* do-while loops execution */
		do {
			System.out.println("Java do while loops:" + n);
			n++;
		} while (n <= times);
		
		n=5;
		while(n<=times) {
			System.out.println("Java while loops:" + n);
			n++;
		}
	}
}
/**
 * while--> check condition --->body
 * do-while--> first body --->condition
 */ 
