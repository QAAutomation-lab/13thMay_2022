package day14.accessmodifiers;
/**
 * Role of Private Constructor If you make any class constructor private, 
 * you cannot create the instance of that class from outside the class.
 */
class A2 {
	private A2() {
	}// private constructor

	void msg() {
		System.out.println("Hello java");
	}
	public static void main(String args[]) {
		A2 a1=new A2();
		a1.msg();
	}
}
public class PrivateAccessModifier2 {
	public static void main(String args[]) {
		A2 obj = new A2();// Compile Time Error
	}
}