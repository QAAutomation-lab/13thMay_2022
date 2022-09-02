package day7.thiskeywords;

class ThisKeyword6 {
	//Global Variable or non static GV or Instance GV
	int variable = 95;
	public static void main(String args[]) {
		ThisKeyword6 obj = new ThisKeyword6();
		obj.method(5);
		obj.method();
		System.out.println("Value of Instance variable :" + obj.variable);//
	}
	void method(int variable) {
		System.out.println("Value of Local variable :" + variable);//
		variable = 80;
		System.out.println("Value of Local variable :" + variable);//
		System.out.println("Value of Instance variable :" + this.variable);//
		this.variable=variable;
		System.out.println("Value of Local variable :" + variable);//
		System.out.println("Value of Instance variable :" + this.variable);//
	}
	void method() {
		int variable = 25;
		System.out.println("Value of Instance variable :" + this.variable);//
		System.out.println("Value of Local variable :" + variable);//
		this.variable=variable;
		System.out.println("Value of Local variable :" + variable);//
		System.out.println("Value of Instance variable :" + this.variable);//
	}
}
