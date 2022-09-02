package day7.staticMethods;

public class NSMethod_Void1 {

	int age;
	public void display() {
		System.out.println("I am display() of Method03 class and age value is: "+age);
	}
	public void display(int a) {
		age=a;
		System.out.println("I am display(int) of Method03 class and age value is: "+age);
	}
	public static void main(String[] args) {
		
		//Method03 m1;//no object creation at this step, its just a reference variable
				//new Method03();//yes, object got creation, but we don't know where this object got created after this step
		//m1=new Method03();//yes,object got created and with the help m1 reference we can access it's members
			//or
		NSMethod_Void1 m2=new NSMethod_Void1();//yes,object got created and with the help m1 reference we can access it's members
		System.out.println("age: "+m2.age);//age=0
		m2.display();//age=0
		m2.display(25);//age=25		
		System.out.println("age: "+m2.age);//25
		
		NSMethod_Void1 m3=new NSMethod_Void1();//yes,object got created and with the help m1 reference we can access it's members
		System.out.println("age: "+m3.age);//age=
		m3.display(75);//age=
		System.out.println("age: "+m3.age);//age=
		m3.display();//age=			
	}
}
