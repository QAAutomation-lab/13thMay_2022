package day18.predefinedclasses.stringclasses;

public class SingleObject {
	/**
	 * 1. constructor should be private
	 * 2. create static ref variable of the class
	 * 3. create static method which return current class object
	 */
	int age=25;
	//1. constructor should be private
	private SingleObject() {
		System.out.println("Sampleton class cons");
	}
	//2. create static ref variable of the class
	public static SingleObject singleObj=new SingleObject();
	//3. create static method which return current class object
	public static SingleObject getSampletonObject() {
		return singleObj;
	}
	public void display(int num) {
		System.out.println("I am display()");
		age=num;
	}
}
class Demo{
	
	public static void main(String[] args) {
		//SingleObject s1=new SingleObject();
		
		SingleObject s1=SingleObject.getSampletonObject();//new SingleObject();
		System.out.println(s1.age);
		s1.display(30);
		System.out.println(s1.age);
		SingleObject s2=SingleObject.getSampletonObject();
		System.out.println(s2.age);
		s2.display(35);
		System.out.println(s2.age);
		System.out.println(s1.age);
	}
}
