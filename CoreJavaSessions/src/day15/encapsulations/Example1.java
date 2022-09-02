package day15.encapsulations;
class Encap{
	private int pinCode=4110;
	private double salary=45000;
	private char grade='A';
	//Getter method: return type should match with private data member
	public int getPinCode() {
		return pinCode;
	}
	public double getSalary() {
		return salary;
	}
	public char getGrade() {
		return grade;
	}
	//Setter method: parameter should be same as private data member
	public void setPinCode(int pin) {
		pinCode=pin;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setGrade(char g) {
		grade=g;
	}
}
public class Example1 {

	public static void main(String[] args) {
		Encap e1=new Encap();
		System.out.println(e1.getPinCode());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGrade());
		System.out.println("*************************");
		e1.setPinCode(5001);
		System.out.println(e1.getPinCode());
		e1.setSalary(55000);
		System.out.println(e1.getSalary());
		e1.setGrade('B');
		System.out.println(e1.getGrade());
	}
}
