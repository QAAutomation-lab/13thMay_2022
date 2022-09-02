package day7.overloading;
public class MethodOverloading2 {

	public void square() {
		System.out.println("No Parameter Method Called");
	}
	public void square(int number) {
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
	}
	public void square(float number) {
		float square = number * number;
		System.out.println("Method with float Argument Called:" + square);
	}
	public static void main(String[] args) {
		MethodOverloading2 obj = new MethodOverloading2();		
		obj.square(2.5f);
		obj.square();
		obj.square(5);
	}
}
/**
if a method declared more dn once in class body with diff set of parameter/arguments sn that will be know as method
overloading(static and non-static)
 diff in parameter:
 					1. type of argument/parameter should differ //or
 					2. number of argument/parameter should differ //or
 					3. position of argument/parameter should differ
 Note: we can't achieve overloading by change method return type
*/