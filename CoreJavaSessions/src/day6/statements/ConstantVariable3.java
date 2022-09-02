package day6.statements;

public class ConstantVariable3 {

	public static void main(String[] args) {
		
		int AGE=15;
		System.out.println("age: "+AGE);
		AGE=10;//compile time error
		System.out.println("updated age1: "+AGE);
		AGE=1;//compile time error
		System.out.println("updated age2: "+AGE);
		//final AGE=25;//wrong syntax, final keyword should be used at time of declaration only
		System.out.println("updated age3: "+AGE);
		AGE=105;//compile time error
		System.out.println("updated age4: "+AGE);
	}
}
/**
when we don't want anyone to change our variable value dn that variable should be declared with final keyword
if you try to change value of final variable dn it will give a compile time error
*/