package day7.thiskeywords;

class ThisKeyword5 {
	int variable = 5;	
	int age=10;
	public static void main(String args[]) {
		ThisKeyword5 obj = new ThisKeyword5();
		obj.method(20);
		obj.method();	
		System.out.println("obj GV variable: "+obj.variable);//
		ThisKeyword5 obj2 = new ThisKeyword5();
		System.out.println("obj2 GV variable: "+obj2.variable);//
	}
	void method(int variable) {
		System.out.println("Value of variable :" + variable);//
		System.out.println("GV Value of variable :" + this.variable);//
		this.variable=variable;
		System.out.println("Value of variable :" + variable);//
		System.out.println("GV Value of variable :" + this.variable);//
	}
	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);
	}
}
