package day9.blocks;

public class Blocks7 {

	final static int age;//using SIB we can initialize final static global variable
	final double salary;
	/* static block or SIB */
	static {
		age = 30;
	}
	/* non-static block or IIB */
	{
		salary = 45000.32;
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: " + Blocks7.age);
		System.out.println("---------------------------------");
		Blocks7 b1 = new Blocks7();
		System.out.println("salary: " + b1.salary);
		System.out.println("main() ends..");
	}
}
