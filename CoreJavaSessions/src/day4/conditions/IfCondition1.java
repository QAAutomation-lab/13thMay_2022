package day4.conditions;

public class IfCondition1 {

	public static void main(String[] args) {
		
		int num1=45, num2=30;
		
		if(num1!=num2) {
			System.out.println("Number1 is not equals to numbers2");
		}else {
			System.out.println("Number1 is equals to  numbers2");
		}
		
		if(num1>num2) {
			System.out.println("Number1 is greater than numbers2");
		}else {
			System.out.println("Number1 is smaller than numbers2");
		}
		  
		if(num1<=num2 ) {
			System.out.println("Number1 is either equals to number2 or greater than numbers2");
		}else {
			System.out.println("Number2 is smaller than numbers1");
		}
		//45,30
		if(num1==num2 || num1>num2) {
			System.out.println("Number1 is either equals to number2 or greater than numbers2");
		}else {
			System.out.println("Number1 is smaller than numbers2");
		}
		
		if(num1>=num2 && num1>num2) {
			System.out.println("Number1 is either equals to number2 or greater than numbers2");
		}else {
			System.out.println("Number1 is smaller than numbers2");
		}

		int sub1=50,sub2=30;
		if(sub1>35 && sub2>35) {
			System.out.println("pass....");
		}else {
			System.out.println("fail....");
		}

	}

}
