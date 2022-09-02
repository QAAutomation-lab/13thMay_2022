package day19.exceptionhandling;
import java.util.Scanner;
public class ExceptionHandling2 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		// 1. abnormal statements
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=scn.nextInt();
		int[] empIds = new int[size];
		try {
			System.out.println("******You are inside try block...**********");
			System.out.println(empIds[3]);// ArrayIndexOutOfBoundsException
			System.out.println("*******Try block ends here...**********");
		} catch (Throwable e) {
			System.out.println("#######catch block starts from here..########");
			System.out.println("Exception object: " + e);
//			System.out.println("Exaption detail by printStackTrace: ");
//			e.printStackTrace();
//			System.out.println("With getMessage: "+e.getMessage());
			System.out.println("#########catch block ends from here..##########");
		}
		System.out.println("Programs ends here...");
	}
}