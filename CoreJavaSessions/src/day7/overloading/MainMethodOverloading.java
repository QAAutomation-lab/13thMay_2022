package day7.overloading;

public class MainMethodOverloading {

	public static void main(String[] args) {
	 System.out.println("I am main(String[] args)");
	 main(15);
	 main(15.5f);
	}
	
	public static void main(int a) {
		System.out.println("I am main(int)");
	}
	
	public static void main(float a) {
		System.out.println("I am main(float)");
	}

}
