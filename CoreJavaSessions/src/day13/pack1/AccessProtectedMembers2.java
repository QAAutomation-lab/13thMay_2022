package day13.pack1;

class AccessProtectedMembers2 {

	public static void main(String[] args) {
		
		ProtectedMembers p1=new ProtectedMembers();
		System.out.println("Accessing Protected members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
