package day7.overloading;

class DisplayOverloading {
	public void disp(char c) {
		System.out.println(c);
	}
	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}
	public void disp(double c, double num) {
		System.out.println(c + " " + num);
	}
}
public class MethodOverloading4 {
	public static void main(String args[]) {
		DisplayOverloading obj = new DisplayOverloading();
		obj.disp('a');
		obj.disp('a', 10);
		obj.disp(10,25);
		MethodOverloading4 m2=new MethodOverloading4();
		m2.call(63.5);
		m2.call(123);
	}
	public void call(double d) {
		System.out.println("Calling.....");
	}
	public void call(int num) {
		System.out.println("Calling....."+num);
	}
}