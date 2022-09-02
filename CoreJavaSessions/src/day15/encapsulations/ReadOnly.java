package day15.encapsulations;
class Student2 {
	// private data member
	private int pinCode = 411015;
	//getter method allow you to use your private data from outside the class
	public int getPinCode() {
		return pinCode;
	}
}
public class ReadOnly {

	public static void main(String[] args) {

		// creating instance of the encapsulated class
		Student2 s = new Student2();
		//System.out.println(s.pinCode());//error, as private member are not accessible from out side the class
		// getting value of the name member
		System.out.println(s.getPinCode());
	}
}