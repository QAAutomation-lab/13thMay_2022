package day7.staticMethods;
/**
 * This class contains method examples
 * @author Asus
 *
 */
public class MethodSyntax {
	/**
	 * Method type: 
	 * Access Modifier: 
	 * non-access Modifier: 
	 * return type: 
	 * method name: 
	 * argument: 
	 * return value: 
	 */
	static void testMyCode() {
		
		//return;// its completely optional, if you don't write it dn java compiler will write on behalf of you
	}
	/**
	 * Method type: 
	 * Access Modifier: 
	 * non-access Modifier: 
	 * return type: 
	 * method name: 
	 * argument:  
	 * return value: 
	 */
	private double getSalary() {
		System.out.println("");
		return 15.356;
	}
	/**
	 * Method type: 
	 * Access Modifier: 
	 * non-access Modifier: 
	 * return type: 
	 * method name: 
	 * argument:  
	 * return value: 
	 */
	protected int empId() {
		int x=101;
		return x;
	}

	/**
	 * Method type: 
	 * Access Modifier: 
	 * non-access Modifier: 
	 * return type: 
	 * method name: 
	 * argument:  
	 * return value: 
	 */
	public void deptNum(int num) {

	}
	/**
	 * Method type: 
	 * Access Modifier: 
	 * non-access Modifier: 
	 * return type: 
	 * method name: 
	 * argument:  
	 * return value: 
	 */
	static void deptNum2(String num) {
		
	}
	/**
	 * Method type: 
	 * Access Modifier: 
	 * non-access Modifier: 
	 * return type: 
	 * method name: 
	 * argument:  
	 * return value: 
	 */
	static boolean deptNum3(int num) {
		boolean res=(num==15);
		return res;
	}

	/**
	 * Method type: 
	 * Access Modifier: 
	 * non-access Modifier: 
	 * return type: 
	 * method name: 
	 * argument:  
	 * return value: 
	 */
	private char deptNum4(boolean b1) {
		return 'A';
	}

	/**
	 * Method type: 
	 * Access Modifier: 
	 * non-access Modifier: 
	 * return type: 
	 * method name: 
	 * argument:  
	 * return value: 
	 */
	public static void main(String[] args) {

	}
}
/*
Method or function both are same
- it contains set of repetitive statements or reusable statements
- it can be two types
		- static
		- non static
- Syntax:
			modifier returntype methodname(args)
			{	
				.........;//statement1
				.........;//statement2
				.........;//statement3
				return value;
			}
	where: 
			modifier = accessmodifier + nonaccessmodifier;
				- accessmodifers --> define visibility of the class members
						* private
						* default
						* protected
						* public
				- non-accessmodifers ---> 
						* static/non-static
						* abstract 
						* native & etc
			returntype: define type of value method should return
						* datatype - primitive or non-primitive datatype
						* void (return value statement is optional) --> won't return any value to JVM
			methodname: valid identifier
			args: argument/parameter ---> optional ----> primitive or non-primitive datatype
			return value---> based on return type, value should be return from the method
*/