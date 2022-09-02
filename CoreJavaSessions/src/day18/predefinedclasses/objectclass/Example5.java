package day18.predefinedclasses.objectclass;
class Print12{	
	int a=10;
	@Override
	public int hashCode() {
		return 101;
	}
	@Override
	public String toString() {
		return "I am Print12 Class toString";
	}	
}
public class Example5{

	static int last_roll = 100;
	int roll_no;
	Example5()
    {
        roll_no = last_roll;
        last_roll++;
    }	
	public static void main(String args[]) {

		Example5 s1 = new Example5();
		System.out.println("s: toString of ObjectClass4: "+s1);
		System.out.println("s: hashCode of ObjectClass4: "+s1.hashCode());
		
		Example5 s2 = new Example5();
		System.out.println("s2: toString of ObjectClass4: "+s2);
		System.out.println("s2: hashCode of ObjectClass4: "+s2.hashCode());
		System.out.println("s1 & s2 compare: "+s1.equals(s2));//
		Example5 s3 =s2;//ObjectClass03 s3 =s2=new ObjectClass03();
		System.out.println("s3 & s2 compare: "+s3.equals(s2));//
		Print12 p1=new Print12();
		System.out.println("toString of Print: "+p1);
		System.out.println("hashCode of Print: "+p1.hashCode());
		Print12 p2=new Print12();
		System.out.println("toString of Print: "+p2);
		System.out.println("hashCode of Print: "+p2.hashCode());
		System.out.println("Comparing Print class object p1 & p2 with overriden equals() :"
								+p1.equals(p2));//
	}
}
/*
 *  == --->compare two values
 *  d1.equals(d2) --> compare two objects based on there address
 * 
 */
