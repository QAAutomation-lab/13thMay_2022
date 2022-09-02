package day7.staticMethods;

public class Concepts {
	double salary=45000.56;
	public static void main(String[] args) {
		int age=25;
		System.out.println(age);
		System.out.println("I my age is :"+age);
		System.out.println(empId);
		System.out.println("My id is: "+Concepts.empId);
		
		Concepts c1=new Concepts();
		System.out.println(c1.salary);
		
		pinCode=411015;
		System.out.println(pinCode);
		empId=1005;
		System.out.println("EmpId: "+empId);
		empId=pinCode-empId;
		System.out.println("new EmpId: "+empId);
		
		c1.salary=12500;
		System.out.println("New salary= "+c1.salary);
		
		Concepts c2=new Concepts();
		System.out.println(c2.salary);

		c2.salary=c1.salary;
		System.out.println(c2.salary);
		System.out.println(c1.salary);
		
		display();
		System.out.println(pinCode);
		Concepts.display();
		
		//System.out.println(display());//compile time error
		
		getEmpId();
		System.out.println(getEmpId());
		int value=getEmpId()-100;
		System.out.println(value);
	}
	static int empId, pinCode;
	
	static double getPinCode() {
		return pinCode;
	}
	
	static int getEmpId() {
		System.out.println("I am getEmpID method");
		return empId;
	}
	static void display() {
		System.out.println("Hi, I am from Pune");
		return;
	}
}
