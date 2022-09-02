package day18.predefinedclasses.scannerclass;

import java.util.Scanner;

public class ScannerClassExample1 {
	public static void main(String args[]) {
		String s = "Hello, This is BasicJava.";
		// Create scanner Object and pass string in it
		/**
		 * As Scanner class inherits Iterator interface, which as following methods
		 * 1. hasNext()---> check weather it has data or not and return true if it has
		 * 2. next()------> it returns the data present in Scanner object 
		 * 3. remove()----> to remove data
		 */
		Scanner scan = new Scanner(s);
		// Check if the scanner has a token
		System.out.println("Boolean Result: " + scan.hasNext());
		// Print the string
		System.out.println("String: " + scan.nextLine());
		scan.close();
		System.out.println("--------Enter Your Details-------- ");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.next();
		System.out.println("Name: " + name);
		System.out.print("Enter your age: ");
		int i = in.nextInt();
		System.out.println("Age: " + i);
		System.out.print("Enter your salary: ");
		double d = in.nextDouble();
		System.out.println("Salary: " + d);
		in.close();
	}
}