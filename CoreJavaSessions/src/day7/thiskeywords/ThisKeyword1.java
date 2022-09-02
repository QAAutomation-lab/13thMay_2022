package day7.thiskeywords;

class Student {
	int rollno;
	float fee;
	Student(int rollno, float fee) {		
		rollno = rollno;
		fee = fee;
	}
	void display() {
		System.out.println(rollno + " " +  fee);
	}
}
class ThisKeyword1 {
	static int age=25;
	public static void main(String args[]) {	
		int age=30;
		System.out.println("Age: "+age);
		System.out.println("SGV age: "+ThisKeyword1.age);
		Student s1 = new Student(111, 5000f);
		s1.display();//
		Student s2 = new Student(112, 6000f);
		s2.display();//
	}
}


