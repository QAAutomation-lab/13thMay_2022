package assignment;
interface Sample1{
	int age=25;//public static final int age=25;
	void display();// public abstract void display();
}
interface Sample2{
	void display1();// public abstract void display();
	void display2();
	void display();
}
class Training implements Sample1,Sample2{
	public void display() {
		System.out.println("I am display abstract method, getting body in Training class");
	}
	public void display1() {
		System.out.println("I am display1 abstract method, getting body in Training class");
	}
	public void display2() {
		System.out.println("I am display2 abstract method, getting body in Training class");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		//Sample1 s1= new Sample1();		
		Sample2 s1=new Training();
		s1.display();
		s1.display1();
		s1.display2();
	}
}
