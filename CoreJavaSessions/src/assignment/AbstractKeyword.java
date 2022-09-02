package assignment;
abstract class Example1{
	abstract void manualTesting();
	void calling() {
		System.out.println("Calling method of Example1 class");
	}
}
abstract class Example3{
	abstract void automationTesting();
}
class Example2 extends Example1{
	void manualTesting() {
		System.out.println("manualTesting method of Example1 class but getting body in Example2 class");
	}
}
class Example4 extends Example3{
	void automationTesting()
	{
		System.out.println("automationTesting method of Example3 class but getting body in Example4 class");
	}
}
public class AbstractKeyword {

	public static void main(String[] args) {
		//Example1 e1=new Example1();
		Example2 e2=new Example2();
		e2.calling();
		e2.manualTesting();
		System.out.println("*******************************");
		Example1 e3=new Example2();
		e3.calling();
		e3.manualTesting();
	}

}
