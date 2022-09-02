package day10.constructors;

public class ThisKeyword {
	static int age;
	int salary;//global variable
	int empId;
	void display(int salary)
	{
		System.out.println("Salary"+salary);//
		System.out.println("NSGV Salary"+this.salary);//
		this.salary=35000;
		System.out.println("update NSGV Salary"+this.salary);//
	}
	public static void main(String[] args) {
		int age=25;
		System.out.println("age: "+age);
		System.out.println("global age:"+ThisKeyword.age);
		int salary=25000;//local variable
		int empId=250;
		System.out.println("local Salary: "+salary);//
		System.out.println("Local EmpId: "+empId);//
		ThisKeyword t1=new ThisKeyword();
		System.out.println("t1: Global EmpID: "+t1.empId);
		System.out.println("t1: Global Salary: "+t1.salary);
		t1.display(45000);
		System.out.println("t1: Global Salary: "+t1.salary);
		ThisKeyword t2=new ThisKeyword();
		System.out.println("t2: Global EmpID: "+t2.empId);
		System.out.println("t2: Global Salary: "+t2.salary);//
		t2.display(45000);	
	}
}
/**
 * this keyword is a predefined keyword in JAVA
 * this keyword is an instance of current class
 * this keyword is used to differentiate non-static local and global variable when they have same name
 * this keyword can be used only for non-static method
*/