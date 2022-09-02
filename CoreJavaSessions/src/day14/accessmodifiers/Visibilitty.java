package day14.accessmodifiers;
class Access{
	 private void demo() {
		 System.out.println("I am default method()");
	 }
}
public class Visibilitty extends Access{
	
	public void demo() {
		System.out.println("Increased Visibility");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
