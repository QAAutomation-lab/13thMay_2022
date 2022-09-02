package day18.predefinedclasses.stringclasses;
class Demo1223{
	private Demo1223() {
		System.out.println("I am zero-param");
	}
	private static Demo1223 d1=new Demo1223();
	String name="Pune";
	static Demo1223 getInstance() {
		return d1;
	}
	 void print() {
		 System.out.println("I am print() of Singleton class Demo1223 ");
	 }
}
public class SingletonClass2 {

	public static void main(String[] args) {
		//Demo1223 d1=new Demo1223();//compile time error due to singleton class concept
				//or
		Demo1223 xyz=Demo1223.getInstance();//d1--->new Demo1223();
		xyz.print();
		System.out.println(xyz.name);//Pune
		xyz.name="Bangalore";
		System.out.println("d1 ref: "+xyz.name);//Bangalore
		Demo1223 d2=Demo1223.getInstance();
		System.out.println("d2 ref: "+d2.name);//Bangalore
	}
}
