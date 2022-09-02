package day10.constructors;
class ConsOverloading1 {
	ConsOverloading1() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	ConsOverloading1(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters");
	}
	ConsOverloading1(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double parameters");
	}
	ConsOverloading1(int a, double b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int,double,int parameters");
	}	
	ConsOverloading1(double a, int b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double,int,int parameters");
	}
	public static void main(String args[]) {
		ConsOverloading1 pc5 = new ConsOverloading1();
		ConsOverloading1 pc1 = new ConsOverloading1(12);
		ConsOverloading1 pc2 = new ConsOverloading1(13.34);
		ConsOverloading1 pc3 = new ConsOverloading1(10,13.34,45);
		ConsOverloading1 pc4 = new ConsOverloading1(13.34,23,87);
	}
}

/**
 * Constructor Overloading: more than on constructor in a  class
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */
