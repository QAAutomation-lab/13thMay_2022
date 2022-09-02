package day3.variabletypes;

public class StaticGlobalVariableExample5 {
	//static global  variables
	static int num1,num2=25,res;
	public static void main(String[] args) {
		System.out.println("Program starts");
		//we can access static global variables using classname from here as main() is also static
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		res=num1+num2;
		System.out.println("Result is : "+res);
		System.out.println("**************************************");
		num1=75;
		System.out.println("updated Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		res=num1+num2;
		System.out.println("updated Result is : "+res);
		System.out.println("**************************************");
		num1=85;
		num2=65;
		System.out.println("updated Number1 is : "+num1);
		System.out.println("updated Number2 is : "+num2);
		res=num1-num2;
		System.out.println("updated Result is : "+res);
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
- static member will have single memory allocation throughout the execution hence any change in its value will have
	impact the original value
*/