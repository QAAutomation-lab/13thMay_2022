package day18.arrays;

import java.util.Arrays;
public class M_Array4 {
	// Java Program to clone the array
	public static void main(String args[]) {
		int array[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int i : array) {
			System.out.print(i+ " ");
		}
		System.out.println("\nPrinting clone of the array:");
		int cloneArray[] = array.clone();
		for (int i : cloneArray) {
			System.out.print(i+ " ");
		}
		System.out.println("\nAre both equal arr & carr ?");
		System.out.println("array & cloneArray content validation : "+Arrays.equals(array, cloneArray));
		System.out.println("******************************");
		int newCopiedArray[]=Arrays.copyOf(array, array.length);
		for (int i : newCopiedArray){
			System.out.print(i+ " ");
		}
		System.out.println("\n******************************");
		int newCopiedRangeArray[]=Arrays.copyOfRange(array, 1, 2);
		for (int i : newCopiedRangeArray){
			System.out.print(i+ " ");
		}
		System.out.println("\nComparing newCopiedRangeArray & newCopiedArray : "
							+Arrays.equals(newCopiedArray, newCopiedRangeArray));	
		System.out.println("**************************");
		Arrays.sort(array);//sort the array elements in ascending order and stores the sorted element in the same array
		System.out.println("After sorting original array:");
		for (int i : array) {
			System.out.print(i+ " ");
		}
	}
}
