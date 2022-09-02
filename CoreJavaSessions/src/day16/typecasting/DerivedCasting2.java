package day16.typecasting;
class Member {
	// Memmber variable of this class
	long phone;
	// Member function of this class
	void chat() {
		// Print message of Member/ Child class
		System.out.println("chatting in whatsapp group with "+phone);
	}
}
class Admin extends Member {
	// Member function of this class
	void addNumber() {
		// Print message of Admin/ Parent class
		System.out.println("adding a new user number in whatsapp group");
	}
}
class DerivedCasting2 {
	// Main driver method
	public static void main(String[] args) {
		// Creating an object Ad
		Member mem = new Admin();//
		mem.phone = 9876543210l;
		// Calling function
		mem.chat();		
		System.out.println("********** After downcasting ********");
		Admin ad = (Admin) mem; // Downcast to access specific property of subclass
		ad.addNumber();
		ad.chat();
		System.out.println(ad.phone);		
		//Admin a1=new Member();//direct downcasting, invalid or not possible
	}
}
/**
* child class object referred by any of its parent known as up casting

* parent class object referred by any of its child class known as downcasting
  directly downcasting is not possible in java

Child c2=new Parent();//downcasting but not possible in this way

Parent p1=new Child();//upcasting-implicit upcasting

Child c1=(Child)p1;//downcasting, as Upcasting object is getting down casted here
 */
