package day18.arrays;
class Example2 {
	int age;
	double salary;
	Example2(){
		System.out.println("Zero-param");
	}
	Example2(int a){
		age=a;
		System.out.println("int-param");
	}
	Example2(double a){
		salary=a;
		System.out.println("double-param");
	}
	void calling() {
		System.out.println("calling of Example1 class, age: "+age);
		System.out.println("calling of Example1 class, salary: "+salary);
	}
}
public class Array7 {
	public static void main(String args[]) {
				
		System.out.println("******************************");
		Example2 e2=new Example2();
		Example2 e3=new Example2(15);
		Example2 e4=new Example2(25.36);
		e2.calling();
		e3.calling();
		e4.calling();	

		int empId1=101,empId2=102,impId3=103;
		int[] empId=new int[3];
		empId[0]=101;
		empId[1]=102;
		empId[2]=103;
		
		System.out.println("*******************************");
	//	Example2[] e=new Example2[] {new Example2(),new Example2(15),new Example2(25.36)};
			//or
	//	Example2[] e={new Example2(),new Example2(15),new Example2(25.36)};
			//or
		Example2[] e=new Example2[3] ;
		e[0]=new Example2(); 		//e2
		e[1]=new Example2(15);		//e3
		e[2]=new Example2(25.36);	//e4
		
		e[0].calling();//e2.calling();
		e[1].calling();//e3.calling();
		e[2].calling();//e4.calling();	
	}
}
