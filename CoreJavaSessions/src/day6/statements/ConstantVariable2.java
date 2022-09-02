package day6.statements;

public class ConstantVariable2 {

	public static void main(String[] args) {
		
		final int AGE=15;//constant
		System.out.println("AGE: "+AGE);
//		AGE=10;//compile time error
//		System.out.println("updated AGE1: "+AGE);
//		AGE=1;//compile time error
//		System.out.println("updated AGE2: "+AGE);
//		AGE=25;//compile time error
//		System.out.println("updated AGE3: "+AGE);
//		AGE=105;//compile time error
//		System.out.println("updated AGE4: "+AGE);
	}
}
/**
when we don't want anyone to change our variable value dn that variable should be declared with final keyword
if you try to change value of final variable dn it will give a compile time error
*/