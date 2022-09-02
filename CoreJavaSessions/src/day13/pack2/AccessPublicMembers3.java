package day13.pack2;

public class AccessPublicMembers3 {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		day13.pack1.PublicMembers p1=new day13.pack1.PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
		day13.pack1.PublicMembers p2=new day13.pack1.PublicMembers();
		
	}
}
