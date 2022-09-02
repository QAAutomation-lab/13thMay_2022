package assignment;

public class Example20 {

	public static void main(String[] args) {
		
		for(int i=1;i<5;i++) {
			//System.out.println(i);
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(int i=1;i<5;i++) {
			//System.out.println(i);
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(char i='a';i<='e';i++) {
			//System.out.println(i);
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
