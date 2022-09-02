package day5.loops;

public class ForLoop {
	public static void main(String args[]) {

		System.out.println("Hello Everyone, Good Morning...");
		System.out.println("Hello Everyone, Good Morning...");
		System.out.println("Hello Everyone, Good Morning...");
		System.out.println("Hello Everyone, Good Morning...");
		System.out.println("Hello Everyone, Good Morning...");
		/*
		 * for(initialization;condition;incr/decr)
		 * {  
		 * //statement or code to be executed  
		 *  }  
		 */
		System.out.println("***************Using for loop********************");
		for(int i=0;i<5;i++) {
			System.out.println("i: "+i+" Hello Everyone, Good Morning...");
		}
		System.out.println("***********Printing 0 to 10 number**********");
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("*************Reverse 10 to 1****************");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("*************Print a to z char*****************");
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.println(c1);
		}
		System.out.println("*************Print A to Z char*****************");
		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.println(c1);
		}
		System.out.println("*************Print z to a char*****************");
	 	for(char c1='z';c1>='a';c1--) {
	 		int ansiValue=c1;
	 		System.out.println(c1+ ": "+ansiValue);
	 	}
	}
}
