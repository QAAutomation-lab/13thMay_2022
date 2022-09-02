package day7.staticMethods;

import java.awt.DisplayMode;

public class MethodWithVoid2_Calling {

	static void display() {
		System.out.println("I am display method");
	}
	static void print(char c1) //char c1='A'; | char c1=c='A'
	{
		System.out.println("I am print method and printing char as: "+c1);
	}
	static void call(int num) //int num =123; | int num=x=123
	{
		System.out.println("I am call method and calling number is: "+num);
		//return;
	}
	public static void main(String[] args) {	
		System.out.println("Program Starts");
		display();
		print('A');
		call(123);
		System.out.println("************passing parameter using variable**************");
		int x=123;
		char c='A';
		print(c);
		call(x);
		System.out.println("Program Ends");
	}
}

/**
when we don't want to return any value to JVM we use return type as void

Debugging: when you want to execute a program line by line, we use debugging

step1: mark a break point in the required location
step2: use following keys to do debug
F6--> to goto next line
F5--> go inside that function
F8--> continue
 */
