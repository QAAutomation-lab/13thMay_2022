package day16.typecasting;

public class PrimitiveCasting1 {

	public static void main(String[] args) {
		
		int myInt = 9;//
		double myDouble = myInt;//widening implicit, when java compiler writes behalf of you--> double myDouble =(double)myInt;
		double d=(double)myInt;//explicit widening
		System.out.println(myInt); //
		System.out.println(myDouble); //
		System.out.println(d);//

		double salary=23400.67856856898989545d;		
		int sal=(int)salary;//narrowing,explicit
		long f=(long)salary;//narrowing,explicit
		float f1=(float)salary;//narrowing,explicit
		System.out.println("Actual Salary: "+salary);
		System.out.println("Int Salary: "+sal);
		System.out.println("long Salary: "+f);
		System.out.println("float Salary: "+f1);
	}

}
