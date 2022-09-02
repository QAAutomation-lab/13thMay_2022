package day4.conditions;
public class IfCondition1_2 { 
 
	public static void main(String[] args) {  
		//defining a variable  
		int number=55;  
		//Check if the number is divisible by 2 or not  
		if(number%2==0){  
			System.out.println("even number");  
		}else{  
			System.out.println("odd number");  
		}  
		checkEvenOddNumber(711);
		checkEvenOddNumber(500);
		checkEvenOddNumber(120);
		System.out.println("Is given number is even? "+isNumberEven(150));
		System.out.println("Is given number is even? "+isNumberEven(101));
		checkEvenOddNumber2();
	} 
	/** static method with argument/parameter and return type as void */
	static void checkEvenOddNumber(int num) {//int num=711;
		if(num%2==0){  
			System.out.println("Given number is even number: "+num);  
		}else{  
			System.out.println("Given number is odd number: "+num);  
		}
	}
	/** static method with argument and return type as boolean */
	static boolean isNumberEven(int num) {
		if(num%2==0){  
			return true;
		}else{  
			return false;
		}
	}
	/** static method with no argument and return type as void */
	static void checkEvenOddNumber2() {
		int num=50;
		if(num%2==0){  
			System.out.println("Given number is even number: "+num);  
		}else{  
			System.out.println("Given number is odd number: "+num);  
		}
	}
}  