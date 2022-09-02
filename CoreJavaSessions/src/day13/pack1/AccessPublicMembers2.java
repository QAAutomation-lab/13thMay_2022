package day13.pack1;

public class AccessPublicMembers2 {

	public static void main(String[] args) {
		
		PublicMembers p1=new PublicMembers();
		System.out.println("Accessing Default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
