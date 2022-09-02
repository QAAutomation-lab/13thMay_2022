package day18.predefinedclasses.scannerclass;

import java.util.Scanner;

public class ScannerClassExample2 {
	public static void main(String args[]) {
		
		int[] empId=new int[5];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<empId.length;i++) {
			System.out.println("Insert your array element in index: "+i);
			empId[i]=in.nextInt();
		}	
		int i=0;
		for(int num:empId) {
			System.out.println("Index "+i+": "+num);
			i++;
		}		
	}
}