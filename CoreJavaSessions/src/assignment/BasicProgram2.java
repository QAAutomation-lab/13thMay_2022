package assignment;

public class BasicProgram2 {
	static int age, empId=101;
	static final boolean RESULT=true;
	final int ACCOUNT_NUMBER;
	BasicProgram2(int x){
		System.out.println("I am BasicProgram2 cons");	
		ACCOUNT_NUMBER=500;
	}
	static int callA(int num) {
		System.out.println("LV of callA(): "+num);
		System.out.println("SGV age from callA(): "+age);
		return num+age;
	}
	double salary=35000;
	void callMe(double salary) {
		System.out.println("LV Salary: "+salary);
		System.out.println("NSGV salary: "+this.salary);
		age=35;
		//display();
		this.callMe();
	}
	void callMe() {
		System.out.println("I am callMe");
	}
	public static void main(String[] args) {
		System.out.println("Program Starts, \nWelcome to core java classes");
		//accessing non static member from static
		BasicProgram2 b1=new BasicProgram2(10);
		System.out.println("NSGV salary: "+b1.salary);
		b1.callMe(456000);
		
		
		int age=25;
		System.out.println("LV age: "+age);
		//accessing static member directly
		System.out.println("LV age: "+age);
		System.out.println("SGV empID:"+empId);
		callA(123);//executes method body but we won't get its return value
		System.out.println(callA(123));//body gets executed and also it will print return value
		int res=callA(233);//executes method body and return value is stored for further use
		//accessing static member with standard
		System.out.println("SGV empID:"+BasicProgram2.empId);
		System.out.println("SGV age: "+BasicProgram2.age);
		BasicProgram2.callA(123);
		System.out.println("Program Ends");
	}

}

/**
 *  static ---> static
 *  static ----> non-static
 *  non-static ----> non-static
 *  non-static---> static(object creation is mandatory)
 */
