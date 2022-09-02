package assignment;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123,rev=0,rem=0;
		while(num!=0) {
			rem=num%10;//123%10=3 ---> 12%10=2  ----> 1%10=1
			rev=rev*10+rem;//10*0+3=3 --->3*10+2=32 ---->32*10+1=321
			num=num/10;//123/10=12 ---->12/10=1  -->1/10=0
		}
		System.out.println("Reverse Number: "+rev);
		System.out.println("Reverse Number using method: "+getReverseNumber(12345));
		System.out.println(getPalindromeNumber(121));
		System.out.println(getPalindromeNumber(123));
	}
	
	public static boolean getPalindromeNumber(int num) {
		/**
		 * rem=num%10
		 * rev=rem+rev*20
		 * num=num/10
		 */
		System.out.println("Check palindrome for number: "+num);
		int rev=0,rem,temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			return true;
		}
		return false;	
	}
	public static int getReverseNumber(int num) {
		/**
		 * rem=num%10
		 * rev=rem+rev*20
		 * num=num/10
		 */
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;		
	}
}
