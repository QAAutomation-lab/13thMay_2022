package day10.constructors;

class ConsOverloading2 {
	int age;
	double salary;
	ConsOverloading2() {
		System.out.println("============Zero- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		System.out.println("============Zero- Parameterized Constructor Ends....============");	
	}	
	ConsOverloading2(int a) {
		System.out.println("============int Parameterized Constructor started============");
		System.out.println(" having int parameters");
		age=a;
		System.out.println("============int Parameterized Constructor Ends....============");
	}
	ConsOverloading2(double b) {
		System.out.println("============double Parameterized Constructor============");
		System.out.println(" having double parameters");
		salary=b;
		System.out.println("============double- Parameterized Constructor Ends....============");
	}
	ConsOverloading2(int a, double b) {
		System.out.println("============int-double Parameterized Constructor started============");
		System.out.println(" having int-double parameters");
		age=a;
		salary=b;
		System.out.println("============int-double Parameterized Constructor Ends....============");
	}

	public static void main(String args[]) {
		ConsOverloading2 pc1 = new ConsOverloading2();
		System.out.println("After Zero-para constructor,Age= "+pc1.age);//
		System.out.println("After Zero-para constructor,Salary= "+pc1.salary);//		
		
		ConsOverloading2 pc2 = new ConsOverloading2(33);
		System.out.println("After int-para constructor,Age= "+pc2.age);//
		System.out.println("After int-para constructor,Salary= "+pc2.salary);//
		
		ConsOverloading2 pc3 = new ConsOverloading2(34000.34);
		System.out.println("After double-para constructor,Age= "+pc3.age);//
		System.out.println("After double-para constructor,Salary= "+pc3.salary);//
		
		ConsOverloading2 pc4 = new ConsOverloading2(30,95000.34);
		System.out.println("After int-double-para constructor,Age= "+pc4.age);//
		System.out.println("After int-double-para constructor,Salary= "+pc4.salary);//
	}
}
/**
 * by using concept of  constructor overloading we can initialize every object/instance with different values
 * 
 */ 
