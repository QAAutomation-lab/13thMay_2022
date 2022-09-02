package day4.operators;

public class Test {
	 static int fun (int n) 
     {
         int result;
         result = fun (n - 1);
         return result;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print(fun(12));
	}

}
