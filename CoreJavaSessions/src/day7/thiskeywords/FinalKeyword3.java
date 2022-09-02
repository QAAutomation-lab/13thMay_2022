package day7.thiskeywords;
class FinalKeyword3 {

	int cube(final int n){ //final int n=5;
		System.out.println(n);//5
		   n=n+2;  
		   return n*n*n;  
		  }

	public static void main(String args[]) {
		FinalKeyword3 b = new FinalKeyword3();
		System.out.println(b.cube(5));
	}
}