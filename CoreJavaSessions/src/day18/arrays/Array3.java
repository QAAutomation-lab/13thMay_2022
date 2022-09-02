package day18.arrays;

public class Array3 {
	public static void main(String[] args) {
		int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
		double sum = 0;
		double average;
		// access all elements using for each loop add each element in sum
		for (int number : numbers) {
			sum = sum + number;//0+2=2+(-9)=-7
					//or
			//sum +=  number; //===> sum = sum + number;
		}
		// get the total number of elements
		int arrayLength = numbers.length;
		// calculate the average convert the average from int to double
		average = sum / arrayLength;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
	}
}
/**
 *  25+50+15+10 =100/4=
 *  10/3=3
 *  -34+70=60/10.0=6.0
 */
