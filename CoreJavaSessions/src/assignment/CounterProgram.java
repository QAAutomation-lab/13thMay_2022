package assignment;

public class CounterProgram {

	public static void main(String[] args) {

		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}
		System.out.println("\n****************************");
		int counter=0;
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			if ((c1 == 'a') || (c1 == 'e') || (c1 == 'i') || (c1 == 'o') || (c1 == 'u')) {
				//System.out.print(c1 + " ");
			}else {
				counter=++counter;
			}
		}
		System.out.println("consonent count between a to z: "+counter);
		int num=20,ct = 0;
		System.out.println(num);
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				//System.out.println(i);
				ct=++ct;
			}
		}
	}

}
