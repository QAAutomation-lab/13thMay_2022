package day11.inheritances;
class Testing{
	void callMe(int num) {
		System.out.println(num+" Calling....");
	}
	final void display() {
		System.out.println("I am display of Testing class");
	}
}
public class Inheritance11Final extends Testing{
// final method can't be overridden
//	void display() {
//		System.out.println("I am display of Inheritance11Final class");
//	}
	void callMe(int xyz) {
		System.out.println("Calling..."+xyz);
		super.callMe(456);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance11Final t1=new Inheritance11Final();
		t1.callMe(123);
		t1.display();
	}

}
