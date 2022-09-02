package day13.pack1;

public class ProtectedMembers {

	protected int accNum=12345;
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		ProtectedMembers p1=new ProtectedMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessProtectedMembers {

	public static void main(String[] args) {
		
		ProtectedMembers p1=new ProtectedMembers();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
 * protected members are accessible with in package 
 * but can be access these member from outside the package using inheritance
 */
