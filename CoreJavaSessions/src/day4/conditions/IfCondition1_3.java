package day4.conditions;

public class IfCondition1_3 {
	public static void main(String[] args) {
		int year = 2000;
		if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
		}
		//way-1
		checkLeapYear(2020);//method will be executed,but return value you won't be able to use/print in console  
		//way-2
		System.out.println("Given year is leap year or not: " + checkLeapYear(2020));//method will be executed, you will also able to print return value on the console
		System.out.println("Given year is leap year or not: " + checkLeapYear(2010));
		//way-3
		boolean res=checkLeapYear(2020);//method will be executed, you will be able to store return value in the variable for future use
		System.out.println("Year status: "+res);
	}
	static boolean checkLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			 System.out.println("LEAP YEAR");
			return true;
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
			return false;
		}
	}
	static boolean checkLeapYear2(int year) {
		
		if(year % 4 == 0) {
			if(year % 100 != 0) {
				System.out.println("Given year is leap year");
				return true;
			}else {
				System.out.println("Given year is not a leap year");
				return false;
			}
		}else if(year % 400 == 0) {
			System.out.println("Given year is leap year");
			return true;
		}else {
			System.out.println("Given year is not a leap year");
			return false;
		}		
	}
	
}

/**



*/