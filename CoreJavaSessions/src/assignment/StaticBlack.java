package assignment;
class Training1{
	static {
		System.out.println("I am SIB of training1 class");
	}
	public void test() {
		System.out.println("Test for Training1");
		System.out.println("Test for Training1");
	}
}
public class StaticBlack extends Training1{

	static {
		System.out.println("I am SIB of staticblock class");
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Program Ends");
	}
}
