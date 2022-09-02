package assignment;

public class ReverseNumberUsingForLoop {

	public static void main(String[] args) {
		System.out.println("Reverse Number: "+getReverseNumber(123));
		System.out.println("is given number palindrome? "+checkPalindromeNumber(1221));
	}
	static int getReverseNumber(int num) {
		System.out.println("Actual Number is : "+num);
		int rev=0;
		for( ;num!=0;num=num/10)
		{
			int remainder = num % 10;
			rev = rev * 10 + remainder;
		}
//		while(num!=0) {
//			int remainder = num % 10;
//			rev = rev * 10 + remainder;
//			num=num/10;
//		}
		return rev;
	}
	static boolean checkPalindromeNumber(int num1) {
		int rev = 0;
		int temp=num1;
		System.out.println("Actaul Number before reverse: "+num1);
		for (; num1 != 0; num1 = num1 / 10) {
			int remainder = num1 % 10;
			rev = rev * 10 + remainder;
		}
		System.out.println("The reverse of the given number is: " + rev);
		if(temp==rev) {
			return true;
		}else {
			return false;
		}
	}
}
/**
 * int number=123, reverse=0, remainder;
 * remainder=number%10;
 * reverse= reverse*10+remainder;
 * number= number/10
 */
