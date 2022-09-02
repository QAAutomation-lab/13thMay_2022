package day11.inheritances;

//parent class
class Company202 {
	void display() {
		System.out.println("I am company class display()...");
	}
}
// child class of Company
class Employee202 extends Company202 {
	//Overridden method
	void display() {
		super.display();
		System.out.println("I am Employee class display()...");
	}
	void callme() {
		System.out.println("I am Employee class callme()...");
	}
}
public class Inheritance9 {

	public static void main(String[] args) {
		Employee202 e1=new Employee202();
		e1.display();
		e1.callme();
		System.out.println("****************************");
		Company202 c1=new Company202();
		c1.display();
		System.out.println("****************************");
		Company202 e2=new Employee202();
		e2.display();
	}
}
