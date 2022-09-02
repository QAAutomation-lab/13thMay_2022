package assignment;

public class Pyramid1 {
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {//number of rows			
			for(int j=0;j<=i;j++) {//pattern in each row
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i=0;i<5;i++) {//number of rows			
			for(int j=0;j<=i;j++) {//pattern in each row
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i=0;i<5;i++) {//number of rows			
			for(int j=0;j<=i;j++) {//pattern in each row
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(char i='a';i<'f';i++) {//number of rows			
			for(char j='a';j<=i;j++) {//pattern in each row
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("--------odd-------------");
		
		System.out.println("---------even------------");
		
		System.out.println("---------prime(1-100)------------");
	}

}
