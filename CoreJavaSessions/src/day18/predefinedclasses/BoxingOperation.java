package day18.predefinedclasses;

public class BoxingOperation {

	public static void main(String[] args) {
	
		int age=20;
		System.out.println("Age: "+age);//20
		
		Integer obj=45;//implicit /auto boxing--->  java compiler convert it into Integer obj=new Integer(45);
		System.out.println("Obj: "+obj);//45
		
		Integer intObj1=new Integer(age);//explicit boxing operation
		System.out.println("intObj1: "+intObj1);//20
		
		System.out.println(age==intObj1);//
		Integer intObj2=new Integer(50);//explicit boxing operation
		System.out.println("intObj2: "+intObj2);//
		Integer intObj3=30;//implicit boxing operation or auto boxing operation
		System.out.println("intObj3: "+intObj3);//
		
		char c1='z';
		Character xyz=c1;//implicit
		Character cObj2=new Character(c1);//explicit
		System.out.println(c1);
		System.out.println(xyz);
		System.out.println(cObj2);
	}
}
