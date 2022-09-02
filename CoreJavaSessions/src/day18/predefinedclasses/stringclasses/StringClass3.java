package day18.predefinedclasses.stringclasses;

public class StringClass3 {
	
	public static void main(String[] args) {
		String s1="I am from UP, I am workig in Accenture, I working as QA Deleivery Head";
		System.out.println("Actual String: "+s1);
		String[] strAry=s1.split(" ");
		for(String s:strAry) {
			System.out.println(s);
		}
		System.out.println("***************************");
		String s2="I am from UP";
		System.out.println("Actual String: "+s2);
		String[] strAry2=s2.split(" ", 3);
		for(String s:strAry2) {
			System.out.println(s);
		}
		System.out.println("***************************");
		String s3="I am from Pune";
		System.out.println("Actual String: "+s3);
		String str[]=s3.split(" ");
		String temp="";
//		for(String s:str) {
//			System.out.println(s);
//		}
		for(int i=str.length-1;i>=0;i--) {
			temp=temp+" "+str[i];
		}
		System.out.println("reverse statement: "+temp);
		System.out.println("***************************");
		String s4="     I am shailesh         ";
		System.out.println("Actual String with spaces: "+s4);
		System.out.println("Actual String length: "+s4.length());
		System.out.println("Actual String without spaces: "+s4.trim());
		System.out.println("Actual String length without spaces: "+s4.trim().length());
		System.out.println("***************************");
		String s5="I    am             shailesh";
		System.out.println("Actual String with spaces: "+s5.trim());
		System.out.println("Actual String length: "+s5.trim().length());
		
	}
}
