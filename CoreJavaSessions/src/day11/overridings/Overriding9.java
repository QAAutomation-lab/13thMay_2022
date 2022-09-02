package day11.overridings;
class Parent5 {
	void show() {
		System.out.println("Parent's show()");
	}
}
class Child5 extends Parent5 {
	// This method overrides show() of Parent
	void show() {
		super.show();
		System.out.println("Child's show()");
	}
}
class GrandChild extends Child5 {
	// This method overrides show() of Parent
	void show() {
		super.show();
		System.out.println("GrandChild's show()");
	}
}
class Overriding9 {
	public static void main(String[] args) {
		Parent5 obj1 = new GrandChild();
		obj1.show();
	}
}