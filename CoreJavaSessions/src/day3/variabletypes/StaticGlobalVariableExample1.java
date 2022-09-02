package day3.variabletypes;

public class StaticGlobalVariableExample1 {
	//static global variables, when we declare a global variable and try to use without initialization dn 
	//will get default value based on data type(only for global variable)
	static int age;
	static boolean res;
	static char grade;
	static float roi;
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		//we can access static global variables directly from here as mian() is also static
		System.out.println("default value of age is: "+age);//
		System.out.println("default value of res is: "+res);//
		System.out.println("default value of grade is: "+grade);//
		System.out.println("default value of roi is: "+roi);//
		System.out.println("Program ends");
	}
}
/**
any variable declared outside the method body but declared in class body known as Global variable
- if its declared with static keyword dn it will known as static global variable
- static global variables are also known as 'class variable/class member'
	- these variable will be loaded in the memory at the time of compilation when a class file is generated
	- in order access static global variable we can use-
		- we can access static global variable from another static method directly
		- standard -we can access static global variable using class name as they are class member for example:
				classname.staticglobalvariablename
- if we declare any global variable but not initialized and trying use it dn it will give you default value based on data type
*/















