package day2.variables;
class VariableExample3
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//syntax to declare a variable: datatype variablename;
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVariable;
		char charVariable;
		boolean booleanVariable;		
		//Syntax to initlize a variable: variablename = value;
		byteVariable = 25;//-10 | -89
		shortVariable = 50;//-10 | -89
		intVariable = 150;//-10 | -89
		longVariable = 2530l;//-10 | -89 | 25
		floatVariable = 25.36f;//25 | -69 |5454 | 0.25f
		doubleVariable = 36.56d;//25 | -69 |54.54 | 0.256
		charVariable = 'A';//'a' | 'Z'
		booleanVariable = true;//true | false
		//print all the varibale value inthe console
		System.out.println("byteVariable = "+byteVariable);
		System.out.println("shortVariable = "+shortVariable);
		System.out.println("intVariable = "+intVariable);
		System.out.println("longVariable = "+longVariable);
		System.out.println("floatVariable = "+floatVariable);
		System.out.println("doubleVariable = "+doubleVariable);
		System.out.println("charVariable = "+charVariable);
		System.out.println("booleanVariable = "+booleanVariable);
		System.out.println("Program ends");
	}
}

/*
 + ----> LHS + RHS  ===> both are number dn it will perform addition operation
 		  25 + 35   = 60
 + ----> LHS + RHS  ===> if anyone from LHS or RHS are non numeric dn it will perform concatination peration
      "Hello " + 65  = Hello 65
	   205 + "Hi"   = 205Hi
	   "Bye "+20 + 20 + 60 = Bye 202060
							Bye 20 + 20 =Bye 2020
							Bye 2020 + 60= Bye 202060
	60 + 10 + 25 + "Good" = 95Good


*/