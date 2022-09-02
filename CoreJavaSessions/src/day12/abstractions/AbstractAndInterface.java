package day12.abstractions;
//Creating interface that has 4 methods  
interface A11 {
	void a();// by default, public and abstract
	void b();
	void c();
	void d();
}
// Creating abstract class that provides the implementation of 'c' method of A11 interface
abstract class B11 implements A11 {
	
	public abstract void a();// by default, public and abstract
	public abstract void b();	
	public abstract void d();
	public void c() {
		System.out.println("I am C");
	}
	public void e() {
		System.out.println("I am E");
	}
}
// Creating subclass of abstract class B11, now we need to provide the implementation of rest of the methods
class M11 extends B11 {
	public void a() {
		System.out.println("I am a");
	}
	public void b() {
		System.out.println("I am b");
	}
	public void d() {
		System.out.println("I am d");
	}
}
// Creating a test class that calls the methods of A interface
class AbstractAndInterface {
	public static void main(String args[]) {
		A11 a = new M11();
		a.a();
		a.b();
		a.c();
		a.d();		
	}
}