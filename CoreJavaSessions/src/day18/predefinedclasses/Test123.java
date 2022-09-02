package day18.predefinedclasses;

import java.util.Scanner;
class fruit {
	String veg;

	void vegetable() {
		Scanner eat = new Scanner(System.in);
		System.out.println("Enter your liked fruit:");
		veg = eat.nextLine();

		System.out.println("Closing the eat" + "\neat is closed");
		eat.close();

	}
}
public class Test123 {

	public static void main(String[] args) {

		fruit s = new fruit();
		s.vegetable();
		Scanner scn=new Scanner(System.in);
		String name;
		System.out.print("Enter name:");
		name=scn.next();
		
//		Scanner scan = new Scanner(System.in);
//		String name;
//		int age;
//		boolean cond;
//		double sal;
//		
//		System.out.println("Enter name of person:");
//		name = scan.next();
//
//		System.out.println("Enter age of person:");
//		age = scan.nextInt();
//
//		if (age > 18) {
//			System.out.println("Person is able to work.");
//		} else {
//			System.out.println("child Labour is not work here.");
//		}
//		System.out.println("Enter cond:");
//		cond = scan.nextBoolean();
//		System.out.println("cond is:" + cond);
//
//		System.out.println("Persons salary is:");
//		sal = scan.nextDouble();
//
//		System.out.print("Enter your name:");
//		int num1;
//		int num2;
//		System.out.println("Enter num1 value:");
//		num1 = scan.nextInt();
//
//		System.out.println("Enter mum2 value:");
//		num2 = scan.nextInt();
//
//		System.out.println("Addition of num1 and num 2:" + addNumber(num1, num2));
//
//		System.out.println("Closing the scan" + "\nScan is closed");
//		scan.close();
	}

	static int addNumber(int num1, int num2) {
		return num1 + num2;

	}
}
