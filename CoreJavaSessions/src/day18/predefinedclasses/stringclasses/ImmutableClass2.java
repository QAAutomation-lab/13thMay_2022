package day18.predefinedclasses.stringclasses;
final class Testing{
	final int age;
	final double salary;
	final String name;
	Testing(int a,double b,String c){
		age=a;
		salary=b;
		name=c;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void display() {
		System.out.println(age);
		System.out.println(salary);
		System.out.println(name);
	}
}
public class ImmutableClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing t1 =new Testing(25,356005.25,"Pune");
		t1.display();	
	}
}
