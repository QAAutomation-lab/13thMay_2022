package day9.blocks;
public class Blocks8 {

	int age;
	double salary;
	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		Blocks8 b1 = new Blocks8();
		b1.print();
		System.out.println("main() ends..");
	}
	/* non-static block or IIB */
	{
		print();
		age=25;
		salary = 45000.32;				
	}
}
