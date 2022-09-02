package day9.blocks;

public class Blocks6 {
	
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-1 of class Blocks2..");		
	}
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}
	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Blocks6 b1=new Blocks6();
		System.out.println("---------------------------------");
		Blocks6 b2=new Blocks6();
		System.out.println("main() ends");
	}
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-2 of class Blocks2..");		
	}
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}
}
