package assignment;
class Demo1{//parent/super class
	Demo1(int x){
		System.out.println("I am Demo1 class param-int cons");
	}
	void callMe() {
		System.out.println("I am callMe method Demo1 class");
	}
	static void display() {
		System.out.println("display method of Demo1 class");
	}
}
//child/sub class
class Demo2 extends Demo1{
	Demo2(){
		super(25);
		System.out.println("I am Demo2 class zero-param cons");
	}
	void calling() {
		System.out.println("I am calling method Demo2 class");
	}
	void talking() {
		System.out.println("Hi, I am talking from Demo2");
	}
	static void displaying() {
		System.out.println("displaying method of Demo1 class");
	}
}
//child/sub class
class Demo3 extends Demo2{
	void calling() {
		super.calling();
		System.out.println("I am calling method Demo3 class, Hi , hello , bye");
		talking();
	}
}
public class OopsRevision {
	public static void main(String[] args) {
		
		Demo3 d2=new Demo3();
		d2.callMe();
		d2.calling();	
		Demo2 d3=new Demo3();
		d3.callMe();
		d3.calling();	
	}	
}
