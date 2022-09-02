package assignment;

public class BasicProgram {
	int age, empId;
	static double salary=35000;
	final static double ACCOUNT_NUMBER=123456;
	final int PIN_CODE;
	static boolean result;
	BasicProgram(int age){
		boolean result=true;
		System.out.println("LV age: "+age);
		System.out.println("LV result from constructor: "+result);
		PIN_CODE=411015;
	}
	void callme(int num) {
		System.out.println(num);
	}
	void demo(int a)
	{
			int age=20;	
			System.out.println("LV a: "+a);
			System.out.println("NSGV empId: "+empId);
			System.out.println("LV age from Demo: "+age);
			System.out.println("NSGV age: "+this.age);
			callme(123);
			this.callme(123);
			System.out.println("SGV result: "+result);
			display(123);
	}
	static int display(int x){
		int k=x;
		System.out.println("LV x from display: "+x);
		System.out.println("LV k from display: "+k);
		return k;
	}
	public static void main(String[] args) {
		//accessing non-static members
		BasicProgram b1=new BasicProgram(25);
		System.out.println("NSGV age: "+b1.age);
		b1.age=29;
		System.out.println("updated NSGV age: "+b1.age);
		b1.demo(45);
		System.out.println("SGV result: "+b1.result);
		b1.result=false;
		
		//accessing static member directly
		System.out.println("SGV result: "+result);
		display(25);//body will be executed but won't get return value
		System.out.println(display(25));//body will be executed and return value will be printed in the console but we can't use it return value further
		int res=display(25);//body will be executed, return value will be stored for further use
		
		//accessing static member with standard
		System.out.println("SGV result: "+BasicProgram.result);
		BasicProgram.display(25);//body will be executed but won't get return value
		System.out.println(BasicProgram.display(25));//body will be executed and return value will be printed in the console but we can't use it return value further
		int res2=BasicProgram.display(25);//body will be executed, return value will be stored for further use
		
		System.out.println("SGV salary: "+salary);
		salary=55000;
		System.out.println("Updated SGV salary: "+salary);
		
		System.out.println("SGV account number: "+ACCOUNT_NUMBER);
		//ACCOUNT_NUMBER=98765;//final cant be change
	}

}
