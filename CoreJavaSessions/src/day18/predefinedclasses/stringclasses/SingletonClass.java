package day18.predefinedclasses.stringclasses;

class Singleton {
	// Constructor of this class, Here private constructor is is used to restricted to this class itself
	private Singleton() {
		s = "Hello I am a string part of Singleton class";
	}

	// Static variable single_instance of type Singleton
	private static Singleton single_instance = new Singleton();
	// Declaring a variable of type String
	public String s;

	// Method Static method to create instance of Singleton class
	public static Singleton getInstanceOfSingleton() {
		// To ensure only one instance is created
		return single_instance;
	}
}

public class SingletonClass {
	// Main driver method
	public static void main(String args[]) {
		
		//Singleton s1=new Singleton();// can't create an object of Singleton class as its constructor is declared as private
		
		// Instantiating Singleton class with variable x
		Singleton x = Singleton.getInstanceOfSingleton();
		System.out.println("String from x is: " + x.s);
		// Instantiating Singleton class with variable y
		Singleton y = Singleton.getInstanceOfSingleton();
		System.out.println("String from y is: " + y.s);
		// instantiating Singleton class with variable z
		Singleton z = Singleton.getInstanceOfSingleton();
		System.out.println("String from z is: " + z.s);
		// Now changing variable of instance x via toUpperCase() method
		System.out.println("**********After converting to upper case*********");
		x.s = (x.s).toUpperCase();
		// Print and display commands
		System.out.println("String from x is: " + x.s);
		System.out.println("String from y is: " + y.s);
		System.out.println("String from z is: " + z.s);
		System.out.println("\n");
		// Now again changing variable of instance x
		System.out.println("**********After converting to lower case*********");
		z.s = (z.s).toLowerCase();
		System.out.println("String from x is: " + x.s);
		System.out.println("String from y is: " + y.s);
		System.out.println("String from z is: " + z.s);
	}
}