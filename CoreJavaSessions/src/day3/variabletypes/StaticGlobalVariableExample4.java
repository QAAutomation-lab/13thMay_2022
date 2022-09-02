package day3.variabletypes;

public class StaticGlobalVariableExample4 {
	//static global  variables
	static int age=25;
	static boolean res;
	static char grade='B';
	static float roi;
	public static void main(String[] args) {
		System.out.println("Program starts");
		//we can access static global variables using classname from here as main() is also static
		System.out.println("value of age is: "+StaticGlobalVariableExample4.age);
		System.out.println("default value of res is: "+StaticGlobalVariableExample4.res);
		System.out.println("value of grade is: "+StaticGlobalVariableExample4.grade);
		System.out.println("default value of roi is: "+StaticGlobalVariableExample4.roi);
		System.out.println("**********************************");
		//initialization of static global variable
		age=35;
		res=true;
		grade='A';
		roi=6.5f;
		System.out.println("updated value of age is: "+StaticGlobalVariableExample4.age);
		System.out.println("updated value of res is: "+StaticGlobalVariableExample4.res);
		System.out.println("updated value of grade is: "+StaticGlobalVariableExample4.grade);
		System.out.println("updated value of roi is: "+StaticGlobalVariableExample4.roi);
		System.out.println("Program ends");
	}
}
/**
any variable declared outside the method body but declared in class body known as Global variable
- if its declared with static keyword dn it will known as static global variable
- static global variables are also known as 'class variable/class member'
	- these variable will be loaded in the memory at the time of compilation when a class file if generated
	- in order access static global variable we can use-
		- we can access static global variable from another static method directly
		- standard -we can access static global variable using class name as they are class member for example:
				classname.staticglobalvariablename
- if we declare any global variable but not initialized and trying used it dn it will give you default value based on data type
*/