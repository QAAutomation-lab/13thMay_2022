package day12.abstractions;
interface Printable2 {
	void print();
}
interface Showable2 extends Printable2 {
	void show();
	//public abstract void print(); ---> inherited method
}
class Interface5 implements Showable2 {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		Interface5 obj = new Interface5();
		obj.print();
		obj.show();
		Printable2 obj2 = new Interface5();
		obj2.print();
		//obj2.show();
	}
}