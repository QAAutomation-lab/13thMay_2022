package day14.accessmodifiers;

import Day32PredefinedClasses.SingleObject;

class Sampleton{
	/**
	 * 1. constructor should be private
	 * 2. create static ref variable of the class
	 * 3. create static method which return current class object
	 */
	//1. constructor should be private
	private Sampleton() {
		System.out.println("Sampleton class cons");
	}
	//2. create static ref variable of the class
	static Sampleton singleObj=new Sampleton();
	//3. create static method which return current class object
	public static Sampleton getSampletonObject() {
		return singleObj;
	}
	void display() {
		System.out.println("I am display()");
	}
}
public class SingletonClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sampleton s1=new Sampleton();// error as Sampleton is a signleton class
		Sampleton.getSampletonObject().display();  //or
		Sampleton s2=Sampleton.getSampletonObject();//indirect meaning---> Sampleton.getInstance() ---> singleObj --->new Sampleton()
		s2.display();
		
		SingleObject sx=SingleObject.getSampletonObject();
		sx.display();
	}

}
