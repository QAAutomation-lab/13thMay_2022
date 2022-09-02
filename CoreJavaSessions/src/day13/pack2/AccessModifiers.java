package day13.pack2;

import day26Pack1.Modifiers;

public class AccessModifiers extends Modifiers{
	public static void main(String[] args) {

		AccessModifiers a1=new AccessModifiers();
		Modifiers m1 = new Modifiers();
		//System.out.println("private variable: " + m1.num1);
		//System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + a1.num3);
		System.out.println("public variable: " + m1.num4);
	}
}
