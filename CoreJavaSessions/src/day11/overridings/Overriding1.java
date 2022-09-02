package day11.overridings;

class Animal1 {
	Animal1(){		
	}
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog extends Animal1 {
	Dog(){
		super();
	}
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}
}
public class Overriding1 {
	public static void main(String args[]) {
		Animal1 a = new Animal1(); // Animal reference and object
		a.move();
		Dog b = new Dog(); // Animal reference but Dog objec
		b.move(); // 
		b.bark(); // 
		System.out.println("********************************************");
		Animal1 a1=new Dog();// you will get dog class move(), bark()
		a1.move();// 
		//a1.bark(); // a1 compile time error since b's reference type Animal doesn't
	}
}