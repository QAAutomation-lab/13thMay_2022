package day12.abstractions;

//import Day8Methods.Method2;

//import Day8Methods.DisplayOverloading;
//import Day8Methods.Method5;
//import Day8Methods.MethodCelsius;
import Day8Methods.*;
//import day13Constructor.MethodOverloading4;
public class Demo123 implements DemoInterface{

	public void display() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Method5 m1=new Method5();
//		m1.average(25, 58, 65);
//		MethodCelsius m2=new MethodCelsius();
//		
//		DisplayOverloading d1=new DisplayOverloading();
		//fullyqualified class name---> packagename.classname
		NSMethod_WirhReturnType.Method5 m1=new NSMethod_WirhReturnType.Method5();
		m1.average(25, 58, 65);
		m1.average(25, 58, 65);
		
		//Day8Methods.Method2.average();
		
		Method2.average();
		day13Constructor.MethodOverloading4.call();
	}

}
