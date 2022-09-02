package day2.variables;
class VariableExample9
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//syntax to declare & initlize a variable: datatype variablename = value;
		// 50 + 15 =65
		int num1=50,num2=15;
		int result=num1+num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Addition of two number is : "+result);//65
		
		//substraction, re-inilization of result variable
		result= num1-num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Substraction of two number is : "+result);//35
		//multipication
		num1=15;
		num2=5;
		result= num1*num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Multipication of two number is : "+result);//75
		//division
		num1=100;
		num2=10;
		result= num1/num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Division of two number is : "+result);//10
		System.out.println("Program ends");
	}
}
