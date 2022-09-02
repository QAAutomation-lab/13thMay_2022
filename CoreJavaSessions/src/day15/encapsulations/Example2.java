package day15.encapsulations;
class Encap1{
	private int pinCode=4110;
	private double salary=45000;
	private char grade='A';
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}	
}
public class Example2 {

	public static void main(String[] args) {
		Encap1 e1=new Encap1();
		System.out.println(e1.getPinCode());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGrade());
		System.out.println("*************************");
		e1.setGrade('C');
		e1.setPinCode(5425);
		e1.setSalary(542222);
		System.out.println(e1.getPinCode());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGrade());
		System.out.println("*************************");
	}
}
