package day6.statements;

public class ConstantVariable4 {

	final static int empId=25;
	final int acc=101;
	public static void main(String[] args) {
		
		final int AGE=15;
		System.out.println("age: "+AGE);
		System.out.println("SGV empId: "+empId);
		ConstantVariable4 c1=new ConstantVariable4();
		System.out.println("NSGV acc: "+c1.acc);
	}
}
/**
if we declare any global variable as final dn its mandatory to iniliatize at the same time
final global variable will consider default value is they are not declared
*/