package day18.predefinedclasses.stringclasses;

public class StringConcat {

	public static void main(String[] args) {
		
		String str="Pune"+1536;
		System.out.println("str:"+str);
		System.out.println("********************************");
		String s1="Mumbai"+null;
		System.out.println("s1: "+s1);
		System.out.println("********************************");
		String s2=str.concat("Delhi");
		System.out.println("s2: "+s2);
		System.out.println("********************************");
		String str1=str.concat(null);//Null Pointer Exception
		System.out.println(str1);
	}
}
