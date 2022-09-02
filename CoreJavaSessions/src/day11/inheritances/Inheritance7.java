package day11.inheritances;
//parent class
class fruits{
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class orange extends fruits {
	int fruitAge;
	orange() {
		// super(); //java compiler will write default super()
		System.out.println("orange class Cons..");
		fruitAge = 5;
	}
	public void taste() {
		System.out.println("orange are sweet");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: "+fruitAge);
		System.out.println("Fruits fruitAge: "+super.fruitAge);
		taste();//calling orange class taste method
		super.taste();//parent class fruit taste method
	}
}
public class Inheritance7 {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		orange o1=new orange();
		o1.shape();
		System.out.println("*******************************************");
	}
}

/*
 * Overriding: When parent class and child class both are having same member dn that will be known as overriding
 * super: is a keyword or instance of super class
 * 			use to refer super class non-static members
 * 			mainly used when subclass and super class having common non-static members
 */ 
/**
 * what is this keyword?
 * why to use this keyword?
 * where can we use this keyword?
 * 
 * what is super keyword?
 * why to use super keyword?
 * where can we use super keyword?
 * 
 * what is super()?
 * why to use super()?
 * where can we use super()?
 * 
 * what is this()?
 * why to use this()?
 * where can we use this()?
 * 
 * this vs super
 * this() vs super()
 */
