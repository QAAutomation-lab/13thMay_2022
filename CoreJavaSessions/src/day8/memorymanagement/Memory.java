package day8.memorymanagement;

public class Memory {	
	static int salary;
	int empId;	
	void display() {
		System.out.println("I am display()...");
	}
	static void print() {
		System.out.println("I am print()...");
	}
	public static void main(String[] args) {
		//access static members---> static variable and method
		System.out.println("static variable salary: "+Memory.salary);//0
		Memory.print();		
		//access non static members---> non-static variable and method
		Memory m1=new Memory();
		System.out.println("non-static variable empId: "+m1.empId);//0
		m1.display();		
		//update static member
		Memory.salary=25000;
		System.out.println("update static variable salary: "+Memory.salary);//25000
		//update non-static member
		m1.empId=205;
		System.out.println("update non-static variable empId: "+m1.empId);//205		
		Memory m2=new Memory();
		System.out.println("2nd instance non-static variable empId: "+m2.empId);//0
		m2.display();
	}
}
/*
 * use break point into required location
 * F6: for next line
 * F5: to go inside the function or method
 * F8: continue to flow
 * ctrl+shift+i : view the value
 */ 
