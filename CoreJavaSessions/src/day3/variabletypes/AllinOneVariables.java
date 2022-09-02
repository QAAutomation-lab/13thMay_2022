package day3.variabletypes;

public class AllinOneVariables {

	//global variable
	static int empId=10;//static global variable
	double salary;//non-static global variable
	public static void main(String[] args) {
		System.out.println("Programs starts");
		//local variables
		int age=25;
		System.out.println("age: "+age);
		System.out.println("*****************Accessing static members*********************");
		System.out.println("initial Static GV empID: "+empId);
		AllinOneVariables.empId=101;
		System.out.println("updated Static GV empID: "+AllinOneVariables.empId);
		System.out.println("*****************Accessing non-static members*********************");
//			AllinOneVariables r2;//no object creation
//			r2=new AllinOneVariables();// object created
		
		AllinOneVariables r1=new AllinOneVariables();
		System.out.println("initial NSGV salary: "+r1.salary);
		r1.salary=95000;
		System.out.println("updated NSGV salary: "+r1.salary);
		
		System.out.println("****************new instance of the class*************************");
		AllinOneVariables r2=new AllinOneVariables();
		System.out.println("initial NSGV salary: "+r2.salary);
		System.out.println("*******************************************************************");
		AllinOneVariables.empId=1001;
		System.out.println("updated Static GV empID: "+empId);
		System.out.println("Programs ends");
	}
}
/*
 * diff: local vs global variable
 * what is class?
 * what is variable?
 * types of variable
 * what is object?
 * why to create object?
 * what is datatype?
 * types of datatype?
 * syntax to compile and execute java program from cmd
 * how to create object?
 * syntax to declare variable?
 * keyword, identifier & literals
 */
