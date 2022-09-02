package day3.variabletypes;

public class NonStaticGlobalVariableExample2 {
	//non static global  variables
	int age;
	boolean res;
	char grade;
	float roi;
	public static void main(String[] args) {
		System.out.println("Program starts");
		//System.out.println(age);//we can't access non-static member directly from main() because its static
		
		//to avoid above error first we need to load all the non-static members into the memory
		//create an instance/object of required class
		NonStaticGlobalVariableExample2 ref; // object declaration
		ref = new NonStaticGlobalVariableExample2();// object initilization
				//or
		NonStaticGlobalVariableExample2 ref1 =new NonStaticGlobalVariableExample2();
		
		System.out.println("default, Non-static variable age: "+ref1.age);
		System.out.println("default, Non-static variable res: "+ref1.res);
		System.out.println("default, Non-static variable grade: "+ref1.grade);
		System.out.println("default, Non-static variable roi: "+ref1.roi);
		System.out.println("Program ends");
	}
}
/**
any variable declared outside the method body but declared in class body known as Global variable
- if its declared without static keyword dn it will known as non-static global/instance variable
- non-static global variables are also known as 'instance variable'
	- these variable will be loaded in the memory at the time of execution/runtime when an instance/object is created
			- Instance/object: has an Identify, behavior & state
							- its used to store non-static members(variables & methods)
		    - Syntax to create an instance or object:
		    				classname refvariable; // instance/object declaration
		    				refvariable =  new classname(); // instance/object creation/initilization
		    						//or
		    				classname refvariable = new classname();
	- Once the instance/object of the class is created a copy of non-staic member will be loaded into the memory
	- for non-static member we can have multiple memory allocation based on instance/object creation
	
	- in order access non-static global variable we can use-
		- we can access non-static global variable from another non-static method directly
		- standard -we can access non-static global variable using refvariable name as:
				refvariable.nonstaticglobalvariablename
- if we declare any global variable but not initialized and trying used it dn it will give you default value based on data type
*/