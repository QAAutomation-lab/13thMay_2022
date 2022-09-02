package day10.constructors;

public class Cons3 {
	int roll;
	double salary;
	//
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Cons3 c1 = new Cons3();
		c1.display();
	}
	
}
