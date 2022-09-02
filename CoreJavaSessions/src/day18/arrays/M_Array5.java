package day18.arrays;

import java.util.Arrays;

class M_Array5{

	public static void main(String[] args) {
		// declaring a source array
		char[] copyFrom = { 'a', 'b', 'c', 'd'};
		//duplicate array
		char[] copyArray=copyFrom.clone();
		
		//sorting copyFrom in ascending order
		Arrays.sort(copyFrom);
		
		boolean result=Arrays.equals(copyArray, copyFrom);
		System.out.println(result);
	}
}

