package day18.predefinedclasses.scannerclass;

class training{
	training(){
		System.out.println("Training class const");
	}
	void manualTesting() {
		System.out.println("I am from manual Testing");
	}
	void automationTesting() {
		System.out.println("I am from Automation Testing");
	}
}
public final class SystemDemo2 {
	static training t1=new training();//static reference
	public static void main(String args[]) {
		System.out.println("Program start");
		SystemDemo2.t1.manualTesting();
		SystemDemo2.t1.automationTesting();
	  //classname.staticRefVar.method
		training t2=new training();
		t2.manualTesting();
		t2.automationTesting();
		System.out.println("Program ends");
	  //classname.staticRefVar.method
		System.err.println("I am error, From SystemDemo2 class");
	}
}
