package day4.operators;

public class Logicalop2 {
	public static void main(String[] args) {
		// Variables Definition and Initialization
		int num1=5, num2=10;
		boolean res1,res2;
		res1=(num1!=num2);
		res2=(num1<num2);
		System.out.println("Result1: "+res1);//
		System.out.println("Result2: "+res2);//
		
		// Logical AND
		System.out.println("bool1 && bool2 = " + (res1 && res2));//

		// Logical OR
		System.out.println("bool1 || bool2 = " + (res1 || res2)); // 

		// Logical Not
		System.out.println("!(bool1 && bool2) = " + !(res1 && res2));//

	}
}
/**
LHS & RHS result should be in boolean format
&& --> and

LHS && RHS ---> if both side are having result as true dn its will retur true else false
true && true --> true
false && true --> false
true && false --> false

|| --> or

LHS || RHS --> if any one side return true dn the result will be true else false
true || true --> true
false || true --> true
true || false --> true
false || false ---> false

! --> not

*/