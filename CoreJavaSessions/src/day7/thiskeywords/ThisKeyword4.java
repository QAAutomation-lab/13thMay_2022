package day7.thiskeywords;

class ThisKeyword4 {
	int age;
	void call() {
		System.out.println("I am call method");
	}
	void m(int age) {
		System.out.println("local age: "+age);
		System.out.println("Global age: "+this.age);
		//call(); //or
		this.call();
		System.out.println("this keyword value is: "+this);// prints same reference ID
	}
	public static void main(String args[]) {
		ThisKeyword4 obj = new ThisKeyword4();
		System.out.println("object obj value is: "+obj);// prints the reference ID
		obj.m(25);
	}
}

