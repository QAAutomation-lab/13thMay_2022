package day11.overridings;
interface Bank {
	float rateOfInterest();
	String bankName();
	static int just() {
		System.out.println("static method of interface");
		Bank.myPrivateMethod(); // accessing private method of interface
		return 45;
	}
	default void call() {
		myPrivateMethod();
	}
	private void myPrivateMethod() {
		System.out.println("Private method of interface Bank");
	}
}

class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}

	public String bankName() {
		return "SBI Bank";
	}

}
public class PrivateMethod {
	public static void main(String[] args) {
		Bank s1 = new SBI();
		System.out.println(s1.bankName());
		System.out.println("SBI ROI: " + s1.rateOfInterest());
		Bank.just(); // accessing static method of interface
	}
}