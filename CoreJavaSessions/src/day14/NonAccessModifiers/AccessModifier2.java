package day14.NonAccessModifiers;

import day27AccessModifiers.AccessModifiers;

public class AccessModifier2 extends AccessModifiers 
{
	private int size=8;
	public static void main(String[] args) {
		
		AccessModifier2 d1=new AccessModifier2();
		System.out.println(d1.areaNum);
		System.out.println(d1.pin);
		//System.out.println(d1.empId);
		//System.out.println(d1.deptNo);
	}

}
