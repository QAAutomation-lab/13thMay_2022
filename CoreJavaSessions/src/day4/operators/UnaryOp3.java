package day4.operators;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a = -1, b;
		b = a++ + ++a + ++a + a;
//initial:  -1     1     2    2 <=== b
//final  :   0     1     2    2 <=== a = -1 + 3= 2
	
		System.out.println("a: "+a);// 2
		System.out.println("b: "+b);// 4
		
		System.out.println("**********************");
		a = 7;
		b = a-- + --a + --a + a;
	
		System.out.println("a: "+a);//
		System.out.println("b: "+b);// 

		a = -21;
		b = --a + --a + --a + a + ++a + a++;//
		
		System.out.println(a);// 
		System.out.println(b);// 

		a = -5;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		
		System.out.println(a);//
		System.out.println(b);//
	}
}
