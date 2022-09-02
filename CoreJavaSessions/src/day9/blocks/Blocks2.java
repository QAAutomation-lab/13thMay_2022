package day9.blocks;

public class Blocks2 {

	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class Blocks2..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		System.out.println("I am main() of Blocks2 class...");
		System.out.println("main() ends");
	}
	/* static block or SIB */
	static {
		System.out.println("running static-block-2 of class Blocks2..");
	}
}
/**
SIB: use to provide some information before we get into actual logic, basically used to initialize static variable of the class
	- it will be executed before main method, as we don't have any name for this
	- without main() SIB won't be executed
	- if we have more dn one SIB dn all the SIB will be executed in sequential order before main()
block-- no name, no return type, no calling
 */ 