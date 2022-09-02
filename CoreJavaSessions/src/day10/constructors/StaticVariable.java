package day10.constructors;

public class StaticVariable {

	static int age=25;
	int empId=101;
	void displaye() {
		int empId=505;
		System.out.println("empId: "+empId);//
		System.out.println("NSGV empId: "+this.empId);//
	}
	public static void main(String[] args) {

		int age=10;
		System.out.println("age: "+age);
		System.out.println("SGV age: "+StaticVariable.age);
		
		StaticVariable s1=new StaticVariable();
		s1.displaye();
		System.out.println(s1.empId);
	}
}

/**
this keyword is an instance of current class
this keyword is used to differentiate non-static global variable and local variable when they have same name
this keyword should used only inside nonstatic method
*/