package assignment;

public class ThisStatement {
	ThisStatement(){
		System.out.println("I am zero-param");
	}
	ThisStatement(int num){
		this(45l);
		System.out.println("I am int-param");
		System.out.println(num);
	}
	ThisStatement(double num){
		this(25);
		System.out.println("I am double-param");
		System.out.println(num);
	}
	ThisStatement(long num){
		this('a');
		System.out.println("I am long-param");
		System.out.println(num);
	}
	ThisStatement(char num){
		System.out.println("I am char-param");
		System.out.println(num);
	}
	public static void main(String[] args) {
		ThisStatement t1=new ThisStatement(25.6);
	}
}
//char-->long-->int-->double
