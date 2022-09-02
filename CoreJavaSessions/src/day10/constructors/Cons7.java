package day10.constructors;

class B {
	int i = 10;
	B() {
		System.out.println("Running Class B constructor..");
		i = 23;
	}
}
public class Cons7 {

	public static void main(String args[]) {
		System.out.println("Main() of Class Cons5 is started...");
		B b1 = new B();
		System.out.println("Class B global varibale i = " + b1.i);
		System.out.println("======================================");
		B b2 = new B();
		System.out.println("Class B global varibale i = " + b2.i);
		System.out.println("Main() of Class Cons5 is ends here...");
	}
}

//constructor overloading & blocks