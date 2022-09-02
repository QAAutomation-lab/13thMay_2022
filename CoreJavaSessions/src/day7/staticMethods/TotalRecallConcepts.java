package day7.staticMethods;

public class TotalRecallConcepts {
	//global variables ---> static and non-static
	static int age1;
	static double salary1 = 2536.0326;
	int age2;
	double salary2 = 568.898;
	// method---> static and non-static method
	void display() {
		System.out.println("Display() is started");
		//access non static global variable directly from another non static method as per rule
		System.out.println("NSGV age2: "+age2);
		System.out.println("NSGV salary2: "+salary2);
		System.out.println("Display() is Ends here");
	}
	double getInterest(int amount, int numOfYrs, double irt) {
		System.out.println("Priciple Amout is: "+amount);
		System.out.println("NOY for loan: "+numOfYrs);
		System.out.println("ROI for your loan: "+irt);
		return 253.5465;
	}
	static void display2() {
		System.out.println("Display2() is started");
		//access static global variable directly from another static method as per rule
		System.out.println("SGV age1: "+age1);
		System.out.println("SGV salary1: "+salary1);
		System.out.println("Display2() is Ends here");
	}
	static double getInterest2(int amount, int numOfYrs, double irt) {
		System.out.println("Priciple Amout is: "+amount);
		System.out.println("NOY for loan: "+numOfYrs);
		System.out.println("ROI for your loan: "+irt);
		double interest=(amount*numOfYrs*irt)/100;
		return interest;
	}
	public static void main(String[] args) {
		//local variable
		int age=10;
		System.out.println("Local variable age: "+age);
		System.out.println("**********************Non static members**********************************");
		//access non-static members---> variable & methods
		TotalRecallConcepts t1=new TotalRecallConcepts();
		System.out.println("NSGV age2: "+t1.age2);
		System.out.println("NSGV salary2: "+t1.salary2);
		t1.display();
		//you will be able to execute method body but won't get its return value
		//t1.getInterest(55000, 2, 5.5f);
		//you will be able to execute method body and also able to print its return value in the console
		System.out.println("ROI: "+t1.getInterest(55000, 2, 5.5f));
		//you will be able to execute method body and store its return value for future action
		double res=t1.getInterest(55000, 2, 5.5f);
		double finalAmount=55000+res;
		System.out.println("FInal amount: "+finalAmount);
		System.out.println("**********************static members**********************************");
		//access static members--> variable & methods
		System.out.println("SGV age1: "+age1);
		System.out.println("SGV salary1: "+TotalRecallConcepts.salary1);
		display2();
		//we will be able to execute method body but we won't get the return value
		getInterest2(55000, 2, 5.5f);
		//you will be able to execute method body as well as you will able to print its return value
		System.out.println("ROI: "+getInterest2(55000, 2, 5.5f));
		//you will be able to execute method body as well as we can store return value in a variable for future actions
		double x=getInterest2(55000, 2, 5.5f);
		System.out.println("x: "+x);
	}
}
/**
what is static keyword? --> identification, why, access, memory
what is static member(variable & method)?
what is static method?
what is static variable?

what is nonstatic?--> identification, why, access, memory
what is nonstatic member(variable & method)?
what is nonstatic method?
what is nonstatic variable?


static vs nonstatic
static method vs nonstatic method

*/