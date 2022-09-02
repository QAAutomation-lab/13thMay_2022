package day18.predefinedclasses.stringclasses;
import java.util.Scanner;
public class StringClass2 {

	public static void main(String[] args) {

		String str1 = "DhanoriPune";// output: enuPironahD
		char c = str1.charAt(0);
		System.out.println("Char at index 0: " + c);

		// to print one by one character of string
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("*************************");
		// to print one by one character of string from the last index
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("**************************");
		String temp = "";// "DhanoriPune";//output: enuPironahD
		for (int i = str1.length() - 1; i >= 0; i--) {
			temp = temp + str1.charAt(i);//""+e=>e+n=>en+u=>enu
		}
		System.out.println("Original str1: " + str1);
		System.out.println("Reverse temp: " + temp);
		System.out.println(reverseString("DhanoriPune"));
		
		String s1="Bangalore";
		System.out.println(reverseString(s1));
		
		Scanner scn=new Scanner(System.in);
		String s2;
		System.out.println("Enter String to be reverse: ");
		s2=scn.next();
		System.out.println("Reverse String is: "+reverseString(s2));

		// System.out.println(palinString("abcd"));
		String s3;
		System.out.println("Enter string to check for palindrome");
		s3=scn.next();
		palinString(s3);

	}

	static String reverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

	static void palinString(String str) {
		String s1 = str;
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		if (temp.equals(s1)) {
			System.out.println("Given string is a palindrome..." + str);
		} else {
			System.out.println("Given string is not a palindrome..." + str);
		}
	}
}
