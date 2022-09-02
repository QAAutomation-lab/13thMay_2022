package day11.inheritances;
//parent class
class fruitA {
	int fruitAge;
	fruitA() {
		System.out.println("fruitA class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class mango extends fruitA {
	int fruitAge;
	mango() {
		// super(); //java compiler will write default super()
		System.out.println("mango class Cons..");
		fruitAge = 5;
	}
	public void taste() {
		System.out.println("Mango are Tart in taste");
	}
	public void shape() {
		System.out.println("mango is round");
	}
}
public class Inheritance8 {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		mango m1=new mango();
		m1.shape();//
		m1.taste();//
		System.out.println(m1.fruitAge);//
		
		fruitA f1=new fruitA();
		f1.taste();//
		System.out.println(f1.fruitAge);//
		System.out.println("*******************************************");
	}

}
