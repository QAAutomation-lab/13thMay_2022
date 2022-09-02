package assignment;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=123,rev=0,rem=0;
		int temp=num;
		while(num!=0) {
			rem=num%10;//123%10=3 ---> 12%10=2  ----> 1%10=1
			rev=rev*10+rem;//10*0+3=3 --->3*10+2=32 ---->32*10+1=321
			num=num/10;//123/10=12 ---->12/10=1  -->1/10=0
		}
		System.out.println("Reverse Number: "+rev);
		if(temp==rev) {
			System.out.println("Given number is palindrome- "+temp);
		}else {
			System.out.println("Given number is not a palindrome- "+temp);
		}
	}
}
