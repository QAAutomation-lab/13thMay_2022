package day17.poly;
class Bank {
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank {
	float getRateOfInterest() {
		return 8.4f;
	}
}
class ICICI extends Bank {
	float getRateOfInterest() {
		return 7.3f;
	}
}
class AXIS extends Bank {
	float getRateOfInterest() {
		return 9.7f;
	}
}
public class Runtime4 {
	public static void main(String args[]) {
		Bank b = new SBI();//upcasting
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());//
		b = new ICICI();//up casting
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());//
		b = new AXIS();//up casting
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());//
	}
}