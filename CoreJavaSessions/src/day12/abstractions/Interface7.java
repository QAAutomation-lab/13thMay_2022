package day12.abstractions;
//Interface
interface Animal12 {
	int age=20;//by default public static final
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}
//Interface
interface Reptile {
	public void color(); // interface method (does not have a body)
}
// Pig "implements" the Animal interface
class Pig12 implements Animal12{
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}
class Dog12 extends Pig12 implements Reptile {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bhow bhow");
	}
	public void color() {
		System.out.println("Color: blue");
	}
}
class Interface7 {
	public static void main(String[] args) {
		Pig12 p1=new Pig12();
		p1.animalSound();
		p1.sleep();
		Dog12 d1=new Dog12();
		d1.animalSound();
		d1.sleep();
		d1.color();
	}
}